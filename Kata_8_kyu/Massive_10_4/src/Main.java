public class Main {
    public static void main(String[] args) {
                                     //Многомерные массивы // Тема 10.4
        // На примере шахматной доски
        Figure [][] board = new Figure[8][8];   // Двухмерный массив
        board[0] = new Figure[]{
                new Figure(ColorType.WHITE,FigureType.ROCK),
                new Figure(ColorType.WHITE,FigureType.HORSE),
                new Figure(ColorType.WHITE,FigureType.ELEPHANT),
                new Figure(ColorType.WHITE,FigureType.KING),
                new Figure(ColorType.WHITE,FigureType.QUEEN),
                new Figure(ColorType.WHITE,FigureType.ELEPHANT),
                new Figure(ColorType.WHITE,FigureType.HORSE),
                new Figure(ColorType.WHITE,FigureType.ROCK)
        };
        for (int i = 0; i < board.length; i++){
            board[1][i] = new Figure(ColorType.WHITE,FigureType.PAWN);
            board[6][i] = new Figure(ColorType.BLACK,FigureType.PAWN);
        }
        board[7] = new Figure[]{
                new Figure(ColorType.BLACK,FigureType.ROCK),
                new Figure(ColorType.BLACK,FigureType.HORSE),
                new Figure(ColorType.BLACK,FigureType.ELEPHANT),
                new Figure(ColorType.BLACK,FigureType.KING),
                new Figure(ColorType.BLACK,FigureType.QUEEN),
                new Figure(ColorType.BLACK,FigureType.ELEPHANT),
                new Figure(ColorType.BLACK,FigureType.HORSE),
                new Figure(ColorType.BLACK,FigureType.ROCK)
        };

        for (int row = 0; row < board.length; row ++){
            for (int cell = 0; cell < board[row].length; cell ++){
                Figure figure = board[row][cell];
                System.out.print(figure == null? "--" : figure);
                System.out.print(cell < 7 ? " " : "\n");
                }
            }
        }
    }
