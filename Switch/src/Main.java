//Усовершенствованная версия программы, в которой
//определяется принадлежность месяца времени года
class Switch{
    public static void main(String args[]){
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "вымышленный месяц";

        }
        System.out.println(
                "Апрель относиться к " + season + ".");
    }
}