/*
    Продемонстрировать применение условного оператора if.
    Присвоить исходному файлу имя "IfSample.java"
 */
class IfSample {
    public  static  void main(String args[]){
        int x,y;

        x=10;
        y=20;

        if (x < y) System.out.println("x меньше чем y ");

        x = x*2;
        if (x == y) System.out.println("x равно y");

        x = x*2;
        if (x > y) System.out.println("x больше y");

        //этот оператор не будет ничего выводить
        if (x==y) System.out.println("вы не увидите этого");
    }
}