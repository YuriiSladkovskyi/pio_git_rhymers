package edu.kis.vh.nursery;

/**
 * Klasa bazowa reprezentująca wyliczankę
 * Działa na zasadzie stosu (LIFO - Last In, First Out)
 * Pozwala na przechowywanie liczb całkowitych w tablicy o stałym rozmiarze
  */


public class DefaultCountingOutRhymer {
    /** Maksymalna liczba elementów, które mogą być przechowywane w wyliczance */
    private static final int SIZE = 12;
    /** Wartość indeksu wskazująca, że wyliczanka jest pusta */
    private static final int IF_EMPTY = -1;
    /** Domyślna wartość zwracana w przypadku błędu lub pustej wyliczanki */
    private static final int DEFAULT_VALUE = -1;

    /** Tablica przechowująca liczby dodane do wyliczanki */
    private final int[] numbers = new int[SIZE];
    /** Indeks wskazujący na ostatnio dodany element w tablicy */
    private int total = IF_EMPTY;

    /**
     * Zwraca aktualną wartość indeksu total
     * @return Bieżący indeks ostatniego elementu
     */
    public int getTotal() {
        return total;
    }

    /**
     * Metoda dodająca wartość do wyliczanki
     * @param in Liczba całkowita, która ma zostać dodana
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka nie zawiera żadnych elementów
     * @return true, jeśli wyliczanka jest pusta; false w przeciwnym razie
     */
        public boolean callCheck() {
            return total == IF_EMPTY;
        }

    /**
     * Sprawdza, czy wyliczanka osiągnęła swój maksymalny rozmiar
     * @return true, jeśli wyliczanka jest pełna; false w przeciwnym razie
     */
            public boolean isFull() {
                return total == SIZE-1;
            }

    /**
     * Zwraca ostatnio dodaną wartość bez usuwania jej z wyliczanki
     * @return Ostatnia wartość w wyliczance lub {@value #DEFAULT_VALUE}, jeśli jest pusta
     */
                protected int peekaboo() {
                    if (callCheck())
                        return DEFAULT_VALUE;
                    return numbers[total];
                }

    /**
     * Zwraca ostatnio dodaną wartość i usuwa ją z wyliczanki
     * @return Ostatnia wartość w wyliczance lub {@value #DEFAULT_VALUE}, jeśli jest pusta
     */
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT_VALUE;
                        return numbers[total--];
                    }
}
