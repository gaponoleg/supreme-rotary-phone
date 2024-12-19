class Counter implements AutoCloseable {
    private int value = 0;

    public void add() {
        value++;
    }

    @Override
    public void close() throws Exception {
        if (value == 0) {
            throw new Exception("Counter was not used in a try-with-resources block");
        }
        value = 0;
    }

    public int getValue() {
        return value;
    }
}


