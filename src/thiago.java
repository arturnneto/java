import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    private Supplier<String> testMessage = () -> "Ops, a lista de elementos não bate!";
    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.arguments(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new Integer[]{2,4,6,8,10}, 2),
                Arguments.arguments(new Integer[]{1, 12, 73, 54, 56, 656, 417, 18, 1129, 23110}, new Integer[]{12,54,417,18}, 3),
                Arguments.arguments(new Integer[]{1000, 1212, 731, 545, 567, 6569, 4170, 189754, 112999, 23111}, new Integer[]{1000, 545, 4170}, 5)
        );
    }

    /**
     * Function that takes two arguments: an array of Integer numbers and an Integer number, the divisor.
     * Returns a list of all the numbers that are divisible by the divisor.
     */
    @ParameterizedTest(name = "Teste array de inteiros com divisor {2}")
    @MethodSource("testData")
    void numbersListFilterTest(Integer[] data, Integer[] expected, Integer divisor){

        assertAll("Validação de inteiros com dividor "+ divisor,
                () -> assertArrayEquals(expected, arraysFilterArray(data, divisor), testMessage),
                () -> assertArrayEquals(expected, arraysFilter.apply(data, divisor), testMessage),
                () -> assertArrayEquals(expected, arraysFilterRec(data, divisor, 0), testMessage)
        );

    }

    /**
     * Note o uso do API Arrays para a cópia. Pode ser usado System.arraycopy também.
     * Caso o exercício não permita o uso desses recursos, então seu método de repassar duas vezes os elementos
     * pode ser eficiente para listas não tão grandes - melhor em do que criar a um novo array a cada iteração
     * @return Array de inteiros do divisor
     */
    Integer[] arraysFilterArray (Integer[] list, Integer divisor) {

        Integer[] divisors = new Integer[list.length/2];
        var pointer = 0;

        for(int i = 0; i < list.length; i++){
            if(i == divisors.length) {
                divisors = Arrays.copyOf(divisors, list.length);
            }
            if(list[i] % divisor == 0){
                divisors[pointer] = list[i];
                pointer++;
            }
        }

        /*
        Para remover as posiçòes null no array -> não necessário, porém, a validação no teste não poderá ser feita considerando o tamanho do array
        Pode ser feita fora com outra função de "limpeza"
         */
        for(int j = 0; j < divisors.length; j++){
            if(divisors[j] == null){
                divisors = Arrays.copyOf(divisors, j);
            }
        }

        return divisors;
    }

    BiFunction<Integer[], Integer, Integer[]> arraysFilter = (list, divisor) ->
            Arrays.asList(list).parallelStream()
                    .filter(f -> f % divisor == 0)
                    .toList().toArray(new Integer[]{});

    //Pode ser passado como argumento para a função para torná-la mais genérica
    BiPredicate<Integer, Integer> isDivisibleBy = (number, divisor) ->
            number % divisor == 0;

    Integer[] arraysFilterRec (Integer[] list, Integer divisor, int index){

        if(index >= list.length){
            return list;
        }
        if(list[index] % divisor == 0){
            int newindex = index + 1;
            return arraysFilterRec(list, divisor, newindex);
        } else {
            var firstpart =  Arrays.copyOfRange(list, 0, index);
            var secondpart = Arrays.copyOfRange(list, index+1, list.length);
            var newarray = new Integer[firstpart.length + secondpart.length];
            System.arraycopy(firstpart, 0, newarray, 0, firstpart.length);
            System.arraycopy(secondpart, 0, newarray, firstpart.length, secondpart.length);

            return arraysFilterRec(newarray, divisor, index);
        }
    }

}