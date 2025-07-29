class nuSource {
    public double maxValue(double[] numbers) {
        // todo
        double max = -1;
        for (double digit : numbers) {
            if (digit > max) {
                max = digit;
            } else {
                continue;
            }
        }
        return max;
    }
}


