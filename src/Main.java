public class Main {
    public static void main(String[] args) {
        String[][] numbers = {{"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4o"}
        };
        try {
            System.out.println(arraySum(numbers));
        }
        catch (MyArrayDataException e){
            System.out.println(e.getMessage());
            System.out.printf("Измените данные в ячейке массива - [%d][%d]", e.getX(), e.getY());
        }
        catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }
    }

    private static int arraySum(String[][] numbers) throws MyArraySizeException, MyArrayDataException{
        if (numbers.length != 4) throw new MyArraySizeException("Неподходящий размер массива!");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length != 4) throw new MyArraySizeException("Неподходящий размер массива!");
        }

        int sum = 0;
        int i = 0;
        int j= 0;
        try {
            for (i = 0; i < numbers.length; i++) {
                for (j = 0; j < numbers[0].length; j++) {
                    sum += Integer.parseInt(numbers[i][j]);
                }
            }
        }catch (NumberFormatException e) {
            throw new MyArrayDataException("Значение как минимум в одной из ячеек массива неверно!", i, j);
        }
        return sum;
    }
}
