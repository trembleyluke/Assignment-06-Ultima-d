public class Main {

    public static void main(String[] args) {
	int worldtime = 67294091;
	int year = worldtime / 1440 /365 + 1;
	int day = worldtime/1440 % 365 + 1;
	int hours = (worldtime/60)%24;
	int minutes = worldtime % 60;

	System.out.printf("It is %d:%02d on day %d of the year %2d\n",hours, minutes, day, year);

	int trammel = worldtime / 1440 % 9 +1;
	int Felucca = worldtime / 1440 %14 +1;

	System.out.printf("Trammel is in day %d of its 9 day cycle\n", trammel);
	System.out.printf("Felucca is in day %d of its 14 day cycle\n", Felucca);


    }
}
