public class Main {
public static int worldtime,year,day,hours,minutes,trammel,felucca;
    public static void main(String[] args) {
		worldtime = 67294091;
		time();
		Trammel();
		Felucca();
	}
	public static void time() {
			year = worldtime / 1440 / 365 + 1;
			day = worldtime / 1440 % 365 + 1;
			hours = (worldtime / 60) % 24;
			minutes = worldtime % 60;

			System.out.printf("It is %d:%02d on day %d of the year %2d\n", hours, minutes, day, year);
		}

		public static void Trammel() {
			trammel = worldtime / 1440 % 9 + 1;
			System.out.printf("Trammel is in day %d of its 9 day cycle\n", trammel);
		}
		public static void Felucca() {
			felucca = worldtime / 1440 % 14 + 1;
			System.out.printf("Felucca is in day %d of its 14 day cycle\n", felucca);
		}

    }

