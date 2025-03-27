package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    int final size = 12;
    private int[] NUMBERS = new int[size];
    int final err_code = -1;
    public int total = err_code;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == err_code;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return err_code;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return err_code;
                        return NUMBERS[total--];
                    }

}
