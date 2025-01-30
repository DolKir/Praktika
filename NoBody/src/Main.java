//Цеелевая часть цикла может быть пустой
class NoBody{
    public static void main(String args[]){
        int i , j;
        i = 100;
        j = 200;
        //расчитать среднее значение переменныъ i и j
        while (++i < --j); //у этого цикла отсутсвует тело
        System.out.println("Среднее значение равно " + i);
    }
}