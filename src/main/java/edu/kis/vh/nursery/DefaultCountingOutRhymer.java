package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    int final SIZE = 12;
    private int[] numbers = new int[SIZE];
    int final ERR_CODE = -1;
    public int total = ERR_CODE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == ERR_CODE;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERR_CODE;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ERR_CODE;
                        return numbers[total--];
                    }

}
