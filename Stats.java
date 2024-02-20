public class Stats {
    
    public static void main(String[] args){
        String option = args[0];
        double[] numbers = new double[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            numbers[i - 1] = Double.parseDouble(args[i]);
        }

        if (option.equals("--product")) {
            double product = 1;
            for (double num : numbers) {
                product *= num;
            }
            System.out.println(product);
        } else if (option.equals("--mean")) {
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            double mean = sum / numbers.length;
            System.out.println(mean);
        } else if (option.equals("--total")) {
            double total = 0;
            for (double num : numbers) {
                total += num;
            }
            System.out.println(total);
        } else if (option.equals("--max")) {
            double max = numbers[0];
            for (double num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println(max);
        } else if (option.equals("--min")) {
            double min = numbers[0];
            for (double num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min);
        } else {
            System.out.println("Bad option " + option);
        }
    }
}

