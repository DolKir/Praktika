//Продемонстрировать применение оператора return
class Return{
    public static void main(String args[]){
        boolean t = true;
        System.out.println("До возврата.");
        if(t) return; //возврат в вызывающий код
        System.out.println("Этот оператор выполнятья не будет.");
    }
}