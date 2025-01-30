//Применение оператоа break в качестве цивилизованной
//формы оператора goto
class Break{
    public static void main(String args[]){
        boolean t = true;

        first:{
            second:{
                third:{
                    System.out.println(
                            "Пердществует оператору brack.");
                    if(t) break second;//выход из блока seconnd
                    System.out.println(
                                "Этот оператор не будет выполняться");
                }
                System.out.println(
                        "Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блококм second.");
        }
    }
}