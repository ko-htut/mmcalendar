package mmcalendar;

import java.util.HashMap;
import java.util.Map;

/**
 * Language Catalog
 * 
 * @author <a href="mailto:chanmratekoko.dev@gmail.com">Chan Mrate Ko Ko</a>
 * 
 * @version 1.0.2 
 * @since 1.0
 * 
 */
public class LanguageCatalog {

	static Map<String, String> myanmar = new HashMap<String, String>();
	static Map<String, String> english = new HashMap<String, String>();
	static Map<String, String> mon = new HashMap<String, String>();
	static Map<String, String> zawgyi = new HashMap<String, String>();
	
	private static LanguageCatalog instance = new LanguageCatalog();
	
	public static LanguageCatalog getInstance(){
		return instance;
	}	

	static {
		myanmar.put("0", "\u1040");
		myanmar.put("1", "\u1041");
		myanmar.put("2", "\u1042");
		myanmar.put("3", "\u1043");
		myanmar.put("4", "\u1044");
		myanmar.put("5", "\u1045");
		myanmar.put("6", "\u1046");
		myanmar.put("7", "\u1047");
		myanmar.put("8", "\u1048");
		myanmar.put("9", "\u1049");
		myanmar.put("January", "\u1007\u1014\u103A\u1014\u101D\u102B\u101B\u102E");
		myanmar.put("February", "\u1016\u1031\u1016\u1031\u102C\u103A\u101D\u102B\u101B\u102E");
		myanmar.put("March", "\u1019\u1010\u103A");
		myanmar.put("April", "\u1027\u1015\u103C\u102E");
		myanmar.put("May", "\u1019\u1031");
		myanmar.put("June", "\u1007\u103D\u1014\u103A");
		myanmar.put("July", "\u1007\u1030\u101C\u102D\u102F\u1004\u103A");
		myanmar.put("August", "\u1029\u1002\u102F\u1010\u103A");
		myanmar.put("September", "\u1005\u1000\u103A\u1010\u1004\u103A\u1018\u102C");
		myanmar.put("October", "\u1021\u1031\u102C\u1000\u103A\u1010\u102D\u102F\u1018\u102C");
		myanmar.put("November", "\u1014\u102D\u102F\u101D\u1004\u103A\u1018\u102C");
		myanmar.put("December", "\u1012\u102E\u1007\u1004\u103A\u1018\u102C");
		myanmar.put("First Waso", "\u1015\u101D\u102B\u1006\u102D\u102F");
		myanmar.put("Second Waso", "\u1012\u102F\u101D\u102B\u1006\u102D\u102F");
		myanmar.put("Tagu", "\u1010\u1014\u103A\u1001\u1030\u1038");
		myanmar.put("Late Tagu", "\u1014\u103E\u1031\u102C\u1004\u103A\u1038\u1010\u1014\u103A\u1001\u1030\u1038");		
		myanmar.put("Kason", "\u1000\u1006\u102F\u1014\u103A");
		myanmar.put("Late Kason", "\u1014\u103E\u1031\u102C\u1004\u103A\u1038\u1000\u1006\u102F\u1014\u103A");
		myanmar.put("Nayon", "\u1014\u101A\u102F\u1014\u103A");
		myanmar.put("Waso", "\u101D\u102B\u1006\u102D\u102F");
		myanmar.put("Wagaung", "\u101D\u102B\u1001\u1031\u102B\u1004\u103A");
		myanmar.put("Tawthalin", "\u1010\u1031\u102C\u103A\u101E\u101C\u1004\u103A\u1038");
		myanmar.put("Thadingyut", "\u101E\u102E\u1010\u1004\u103A\u1038\u1000\u103B\u103D\u1010\u103A");
		myanmar.put("Tazaungmon", "\u1010\u1014\u103A\u1006\u1031\u102C\u1004\u103A\u1019\u102F\u1014\u103A\u1038");
		myanmar.put("Nadaw", "\u1014\u1010\u103A\u1010\u1031\u102C\u103A");
		myanmar.put("Pyatho", "\u1015\u103C\u102C\u101E\u102D\u102F");
		myanmar.put("Tabodwe", "\u1010\u1015\u102D\u102F\u1037\u1010\u103D\u1032");
		myanmar.put("Tabaung", "\u1010\u1015\u1031\u102B\u1004\u103A\u1038");
		myanmar.put("waxing", "\u101C\u1006\u1014\u103A\u1038");
		myanmar.put("waning", "\u101C\u1006\u102F\u1010\u103A");
		myanmar.put("full moon", "\u101C\u1015\u103C\u100A\u103A\u1037");
		myanmar.put("new moon", "\u101C\u1000\u103D\u101A\u103A");
		myanmar.put("Myanmar Year", "\u1019\u103C\u1014\u103A\u1019\u102C\u1014\u103E\u1005\u103A");
		myanmar.put("Ku", "\u1001\u102F");
		myanmar.put("Late", "\u1014\u103E\u1031\u102C\u1004\u103A\u1038");
		myanmar.put("Second", "\u1012\u102F");
		myanmar.put("Sunday", "\u1010\u1014\u1004\u103A\u1039\u1002\u1014\u103D\u1031");
		myanmar.put("Monday", "\u1010\u1014\u1004\u103A\u1039\u101C\u102C");
		myanmar.put("Tuesday", "\u1021\u1004\u103A\u1039\u1002\u102B");
		myanmar.put("Wednesday", "\u1017\u102F\u1012\u1039\u1013\u101F\u1030\u1038");
		myanmar.put("Thursday", "\u1000\u103C\u102C\u101E\u1015\u1010\u1031\u1038");
		myanmar.put("Friday", "\u101E\u1031\u102C\u1000\u103C\u102C");
		myanmar.put("Saturday", "\u1005\u1014\u1031");
		myanmar.put("Nay", "\u1014\u1031\u1037");
		myanmar.put("Yat", "\u101B\u1000\u103A");
		myanmar.put("Sabbath Eve", "\u1021\u1016\u102D\u1010\u103A");
		myanmar.put("Sabbath", "\u1025\u1015\u102F\u101E\u103A");
		myanmar.put("Yatyaza", "\u101B\u1000\u103A\u101B\u102C\u1007\u102C");
		myanmar.put("Afternoon Pyathada", "\u1019\u103D\u1014\u103A\u1038\u101C\u103D\u1032\u1015\u103C\u103F\u1012\u102B\u1038");
		myanmar.put("Pyathada", "\u1015\u103C\u103F\u1012\u102B\u1038");
		myanmar.put("New Year Day", "New Year's Day");
		myanmar.put("Independence Day", "\u101C\u103D\u1010\u103A\u101C\u1015\u103A\u101B\u1031\u1038\u1014\u1031\u1037");
		myanmar.put("Union Day", "\u1015\u103C\u100A\u103A\u1011\u1031\u102C\u1004\u103A\u1005\u102F\u1014\u1031\u1037");
		myanmar.put("Peasants Day", "\u1010\u1031\u102C\u1004\u103A\u101E\u1030 \u101C\u101A\u103A\u101E\u1019\u102C\u1038\u1014\u1031\u1037");
		myanmar.put("Resistance Day", "\u1010\u1031\u102C\u103A\u101C\u103E\u1014\u103A\u101B\u1031\u1038\u1014\u1031\u1037");
		myanmar.put("Labour Day", "\u1021\u101C\u102F\u1015\u103A\u101E\u1019\u102C\u1038\u1014\u1031\u1037");
		myanmar.put("Martyrs Day", "\u1021\u102C\u1007\u102C\u1014\u100A\u103A\u1014\u1031\u1037");
		myanmar.put("Christmas Day", "\u1001\u101B\u1005\u1039\u1005\u1019\u1010\u103A\u1014\u1031\u1037");
		myanmar.put("Buddha Day", "\u100A\u1031\u102C\u1004\u103A\u101B\u1031\u101E\u103D\u1014\u103A\u1038\u1015\u103D\u1032");
		myanmar.put("Start of Buddhist Lent", "\u1013\u1019\u1039\u1019\u1005\u1000\u103C\u102C\u1014\u1031\u1037");
		myanmar.put("End of Buddhist Lent", "\u1019\u102E\u1038\u1011\u103D\u1014\u103A\u1038\u1015\u103D\u1032");
		myanmar.put("Tazaungdaing", "\u1010\u1014\u103A\u1006\u1031\u102C\u1004\u103A\u1010\u102D\u102F\u1004\u103A");
		myanmar.put("National Day", "\u1021\u1019\u103B\u102D\u102F\u1038\u101E\u102C\u1038\u1014\u1031\u1037");
		myanmar.put("Karen New Year Day", "\u1000\u101B\u1004\u103A\u1014\u103E\u1005\u103A\u101E\u1005\u103A\u1000\u1030\u1038");
		myanmar.put("Tabaung Pwe", "\u1010\u1015\u1031\u102B\u1004\u103A\u1038\u1015\u103D\u1032");
		myanmar.put("Thingyan Akyo", "\u101E\u1004\u103A\u1039\u1000\u103C\u1014\u103A\u1021\u1000\u103C\u102D\u102F");
		myanmar.put("Thingyan Akya", "\u101E\u1004\u103A\u1039\u1000\u103C\u1014\u103A\u1021\u1000\u103B");
		myanmar.put("Thingyan Akyat", "\u101E\u1004\u103A\u1039\u1000\u103C\u1014\u103A\u1021\u1000\u103C\u1010\u103A");
		myanmar.put("Thingyan Atat", "\u101E\u1004\u103A\u1039\u1000\u103C\u1014\u103A\u1021\u1010\u1000\u103A");
		myanmar.put("Myanmar New Year Day", "\u1014\u103E\u1005\u103A\u1006\u1014\u103A\u1038\u1010\u1005\u103A\u101B\u1000\u103A");
		myanmar.put("Amyeittasote", "\u1021\u1019\u103C\u102D\u1010\u1039\u1010\u1005\u102F\u1010\u103A");
		myanmar.put("Warameittugyi", "\u101D\u102B\u101B\u1019\u102D\u1010\u1039\u1010\u102F\u1000\u103C\u102E\u1038");
		myanmar.put("Warameittunge", "\u101D\u102B\u101B\u1019\u102D\u1010\u1039\u1010\u102F\u1004\u101A\u103A");
		myanmar.put("Thamaphyu", "\u101E\u1019\u102C\u1038\u1016\u103C\u1030");
		myanmar.put("Thamanyo", "\u101E\u1019\u102C\u1038\u100A\u102D\u102F");
		myanmar.put("Yatpote", "\u101B\u1000\u103A\u1015\u102F\u1015\u103A");
		myanmar.put("Yatyotema", "\u101B\u1000\u103A\u101A\u102F\u1010\u103A\u1019\u102C");
		myanmar.put("Mahayatkyan", "\u1019\u101F\u102C\u101B\u1000\u103A\u1000\u103C\u1019\u103A\u1038");
		myanmar.put("Nagapor", "\u1014\u1002\u102B\u1038\u1015\u1031\u102B\u103A");
		myanmar.put("Shanyat", "\u101B\u103E\u1019\u103A\u1038\u101B\u1000\u103A");
		myanmar.put(",", "\u104A");
		myanmar.put(".", "\u104B");
		myanmar.put("Mon National Day", "\u1019\u103D\u1014\u103A\u1021\u1019\u103B\u102D\u102F\u1038\u101E\u102C\u1038\u1014\u1031\u1037");
		myanmar.put("G. Aung San BD", "\u1017\u102D\u102F\u101C\u103A\u1001\u103B\u102F\u1015\u103A\u1019\u103D\u1031\u1038\u1014\u1031\u1037");
		myanmar.put("Valentines Day", "\u1001\u103B\u1005\u103A\u101E\u1030\u1019\u103B\u102C\u1038\u1014\u1031\u1037");
		myanmar.put("Earth Day", "\u1000\u1019\u1039\u1018\u102C\u1019\u103C\u1031\u1014\u1031\u1037");
		myanmar.put("April Fools Day", "\u1027\u1015\u103C\u102E\u1021\u101B\u1030\u1038\u1014\u1031\u1037");
		myanmar.put("Red Cross Day", "\u1000\u103C\u1000\u103A\u1001\u103C\u1031\u1014\u102E\u1014\u1031\u1037");
		myanmar.put("United Nations Day", "\u1000\u102F\u101C\u101E\u1019\u1039\u1019\u1002\u1039\u1002\u1014\u1031\u1037");
		myanmar.put("Halloween", "\u101E\u101B\u1032\u1014\u1031\u1037");
		myanmar.put("Shan New Year Day", "\u101B\u103E\u1019\u103A\u1038\u1014\u103E\u1005\u103A\u101E\u1005\u103A\u1000\u1030\u1038");
		myanmar.put("Mothers Day", "\u1021\u1019\u1031\u1014\u1031\u1037");
		myanmar.put("Fathers Day", "\u1021\u1016\u1031\u1014\u1031\u1037");
		myanmar.put("Sasana Year", "\u101E\u102C\u101E\u1014\u102C\u1014\u103E\u1005\u103A");
		myanmar.put("Eid", "\u1021\u102D\u1012\u103A");
		myanmar.put("Diwali", "\u1012\u102E\u101D\u102B\u101C\u102E");
		myanmar.put("Mahathamaya Day", "\u1019\u101F\u102C\u101E\u1019\u101A\u1014\u1031\u1037");
		myanmar.put("Garudhamma Day", "\u1002\u101B\u102F\u1013\u1019\u1039\u1019\u1014\u1031\u1037");
		myanmar.put("Metta Day", "\u1019\u1031\u1010\u1039\u1010\u102C\u1014\u1031\u1037");
		myanmar.put("Taungpyone Pwe", "\u1010\u1031\u102C\u1004\u103A\u1015\u103C\u102F\u1014\u103A\u1038\u1015\u103D\u1032");
		myanmar.put("Yadanagu Pwe", "\u101B\u1010\u1014\u102C\u1037\u1002\u1030\u1015\u103D\u1032");
		myanmar.put("Authors Day", "\u1005\u102C\u1006\u102D\u102F\u1010\u1031\u102C\u103A\u1014\u1031\u1037");
		myanmar.put("World Teachers Day", "\u1000\u1019\u1039\u1018\u102C\u1037\u1006\u101B\u102C\u1019\u103B\u102C\u1038\u1014\u1031\u1037");
		myanmar.put("Holiday", "\u101B\u102F\u1036\u1038\u1015\u102D\u1010\u103A\u101B\u1000\u103A");
		myanmar.put("Chinese New Year", "\u1010\u101B\u102F\u1010\u103A\u1014\u103E\u1005\u103A\u101E\u1005\u103A\u1000\u1030\u1038");
		myanmar.put("Easter", "\u1011\u1019\u103C\u1031\u102C\u1000\u103A\u101B\u102C\u1014\u1031\u1037");
		myanmar.put("Good Friday", "\u101E\u1031\u102C\u1000\u103C\u102C\u1014\u1031\u1037\u1000\u103C\u102E\u1038");
				
		myanmar.put("West", "\u1021\u1014\u1031\u102C\u1000\u103A");
		myanmar.put("North", "\u1019\u103C\u1031\u102C\u1000\u103A");
		myanmar.put("East", "\u1021\u101B\u103E\u1031\u1037");
		myanmar.put("South", "\u1010\u1031\u102C\u1004\u103A");	
		myanmar.put("Binga", "\u1018\u1004\u103A\u1039\u1002");
		myanmar.put("Atun", "\u1021\u1011\u103D\u1014\u103A\u1038");
		myanmar.put("Yaza",  "\u101B\u102C\u1007");
		myanmar.put("Adipati", "\u1021\u1013\u102D\u1015\u1010\u102D");
		myanmar.put("Marana", "\u1019\u101B\u100F");
		myanmar.put("Thike", "\u101E\u102D\u102F\u1000\u103A");
		myanmar.put("Puti", "\u1015\u102F\u1010\u102D");
		myanmar.put("Orc", "\u1018\u102E\u101C\u1030\u1038");
		myanmar.put("Elf", "\u1014\u1010\u103A");
		myanmar.put("Human", "\u101C\u1030");

		// English
		english.put("0", "0");
		english.put("1", "1");
		english.put("2", "2");
		english.put("3", "3");
		english.put("4", "4");
		english.put("5", "5");
		english.put("6", "6");
		english.put("7", "7");
		english.put("8", "8");
		english.put("9", "9");
		english.put("January", "January");
		english.put("February", "February");
		english.put("March", "March");
		english.put("April", "April");
		english.put("May", "May");
		english.put("June", "June");
		english.put("July", "July");
		english.put("August", "August");
		english.put("September", "September");
		english.put("October", "October");
		english.put("November", "November");
		english.put("December", "December");
		english.put("First Waso", "First Waso");
		english.put("Second Waso", "\u1012\u102F\u101D\u102B\u1006\u102D\u102F");
		english.put("Tagu", "Tagu");
		english.put("Late Tagu", "Late Tagu");	
		english.put("Kason", "Kason");
		english.put("Late Kason", "Late Kason");
		english.put("Nayon", "Nayon");
		english.put("Waso", "Waso");
		english.put("Wagaung", "Wagaung");
		english.put("Tawthalin", "Tawthalin");
		english.put("Thadingyut", "Thadingyut");
		english.put("Tazaungmon", "Tazaungmon");
		english.put("Nadaw", "Nadaw");
		english.put("Pyatho", "Pyatho");
		english.put("Tabodwe", "Tabodwe");
		english.put("Tabaung", "Tabaung");
		english.put("waxing", "waxing");
		english.put("waning", "waning");
		english.put("full moon", "full moon");
		english.put("new moon", "new moon");
		english.put("Myanmar Year", "Myanmar Year");
		english.put("Ku", "");
		english.put("Late", "Late ");
		english.put("Second", "Second ");
		english.put("Sunday", "Sunday");
		english.put("Monday", "Monday");
		english.put("Tuesday", "Tuesday");
		english.put("Wednesday", "Wednesday");
		english.put("Thursday", "Thursday");
		english.put("Friday", "Friday");
		english.put("Saturday", "Saturday");
		english.put("Nay", "");
		english.put("Yat", "");
		english.put("Sabbath Eve", "Sb Eve");
		english.put("Sabbath", "Sabbath");
		english.put("Yatyaza", "Yatyaza");
		english.put("Afternoon Pyathada", "Afternoon Pyathada");
		english.put("Pyathada", "Pyathada");
		english.put("New Year Day", "New Year's Day");
		english.put("Independence Day", "Independence Day");
		english.put("Union Day", "Union Day");
		english.put("Peasants Day", "Peasants Day");
		english.put("Resistance Day", "Resistance Day");
		english.put("Labour Day", "Labour Day");
		english.put("Martyrs Day", "Martyrs' Day");
		english.put("Christmas Day", "Christmas Day");
		english.put("Buddha Day", "Buddha Day");
		english.put("Start of Buddhist Lent", "Start of Buddhist Lent");
		english.put("End of Buddhist Lent", "End of Buddhist Lent");
		english.put("Tazaungdaing", "Tazaungdaing");
		english.put("National Day", "National Day");
		english.put("Karen New Year Day", "Karen New Year Day");
		english.put("Tabaung Pwe", "Tabaung Pwe");
		english.put("Thingyan Akyo", "Thingyan Akyo");
		english.put("Thingyan Akya", "Thingyan Akya");
		english.put("Thingyan Akyat", "Thingyan Akyat");
		english.put("Thingyan Atat", "Thingyan Atat");
		english.put("Myanmar New Year Day", "Myanmar New Year Day");
		english.put("Amyeittasote", "Amyeittasote");
		english.put("Warameittugyi", "Warameittugyi");
		english.put("Warameittunge", "Warameittunge");
		english.put("Thamaphyu", "Thamaphyu");
		english.put("Thamanyo", "Thamanyo");
		english.put("Yatpote", "Yatpote");
		english.put("Yatyotema", "Yatyotema");
		english.put("Mahayatkyan", "Mahayatkyan");
		english.put("Nagapor", "Nagapor");
		english.put("Shanyat", "Shanyat");
		english.put(",", ",");
		english.put(".", ".");
		english.put("Mon National Day", "Mon National Day");
		english.put("G. Aung San BD", "G. Aung San BD");
		english.put("Valentines Day", "Valentines Day");
		english.put("Earth Day", "Earth Day");
		english.put("April Fools Day", "April Fools' Day");
		english.put("Red Cross Day", "Red Cross Day");
		english.put("United Nations Day", "United Nations Day");
		english.put("Halloween", "Halloween");
		english.put("Shan New Year Day", "Shan New Year Day");
		english.put("Mothers Day", "Mothers' Day");
		english.put("Fathers Day", "Fathers' Day");
		english.put("Sasana Year", "Sasana Year");
		english.put("Eid", "Eid");
		english.put("Diwali", "Diwali");
		english.put("Mahathamaya Day", "Great Integration");
		english.put("Garudhamma Day", "Garudhamma Day");
		english.put("Metta Day", "Metta Day");
		english.put("Taungpyone Pwe", "Taungpyone Pwe");
		english.put("Yadanagu Pwe", "Yadanagu Pwe");
		english.put("Authors Day", "Authors' Day");
		english.put("World Teachers Day", "World Teachers' Day");
		english.put("Holiday", "Holiday");
		english.put("Chinese New Year", "Chinese New Year");
		english.put("Easter", "Easter");
		english.put("Good Friday", "Good Friday");
		
		english.put("West", "West");
		english.put("North", "North");
		english.put("East", "East");
		english.put("South", "South");		
		english.put("Binga", "Binga");
		english.put("Atun", "Atun");
		english.put("Yaza", "Yaza");
		english.put("Adipati", "Adipati");
		english.put("Marana", "Marana");
		english.put("Thike", "Thike");
		english.put("Puti", "Puti");
		english.put("Orc", "Orc");
		english.put("Elf", "Elf");
		english.put("Human", "Human");

		// Mon
		mon.put("0", "\u1040");
		mon.put("1", "\u1041");
		mon.put("2", "\u1042");
		mon.put("3", "\u1043");
		mon.put("4", "\u1044");
		mon.put("5", "\u1045");
		mon.put("6", "\u1046");
		mon.put("7", "\u1047");
		mon.put("8", "\u1048");
		mon.put("9", "\u1049");
		mon.put("January", "\u1002\u103B\u102C\u1014\u103A\u1014\u103B\u1030\u1021\u102C\u101B\u1033");
		mon.put("February", "\u101D\u103E\u1031\u101D\u103A\u1017\u103B\u1030\u1021\u102C\u101B\u1033");
		mon.put("March", "\u1019\u102C\u1010\u103A\u1001\u103B\u103A");
		mon.put("April", "\u1028\u1015\u103C\u1031\u101A\u103A\u101C\u103A");
		mon.put("May", "\u1019\u1031");
		mon.put("June", "\u1002\u103B\u102F\u1014\u103A");
		mon.put("July", "\u1002\u103B\u1030\u101C\u102C\u105A\u103A");
		mon.put("August", "\u1021\u101D\u103A\u1002\u102B\u1010\u103A");
		mon.put("September", "\u101E\u102D\u1010\u103A\u1011\u102E\u1017\u102C");
		mon.put("October", "\u1021\u1036\u1000\u103A\u1011\u101D\u103A\u1017\u102C");
		mon.put("November", "\u1014\u101D\u103A\u101D\u102B\u1019\u103A\u1017\u102C");
		mon.put("December", "\u1012\u102E\u1007\u103C\u1031\u1014\u103A\u1017\u102C");
		mon.put("First Waso", "\u1002\u102D\u1010\u102F\u1015-\u1012\u1039\u1002\u102D\u102F\u1014\u103A");
		mon.put("Second Waso", "\u1012\u102F\u101D\u102B\u1006\u102D\u102F"); //need to translate
		mon.put("Tagu", "\u1002\u102D\u1010\u102F\u1005\u1032");
		mon.put("Late Tagu", "\u1014\u103E\u1031\u102C\u1004\u103A\u1038\u1010\u1014\u103A\u1001\u1030\u1038");  //need to translate
		mon.put("Kason", "\u1002\u102D\u1010\u102F\u1015\u101E\u102C\u103A");
		mon.put("Late Kason", "\u1014\u103E\u1031\u102C\u1004\u103A\u1038\u1000\u1006\u102F\u1014\u103A"); //need to translate
		mon.put("Nayon", "\u1002\u102D\u1010\u102F\u1007\u103E\u1031\u103A");
		mon.put("Waso", "\u1002\u102D\u1010\u102F\u1012\u1039\u1002\u102D\u102F\u1014\u103A");
		mon.put("Wagaung", "\u1002\u102D\u1010\u102F\u1001\u1039\u100D\u1032\u101E\u1033");
		mon.put("Tawthalin", "\u1002\u102D\u1010\u102F\u1018\u1010\u103A");
		mon.put("Thadingyut", "\u1002\u102D\u1010\u102F\u101D\u103E\u103A");
		mon.put("Tazaungmon", "\u1002\u102D\u1010\u102F\u1000\u1039\u1011\u102D\u102F\u1014\u103A");
		mon.put("Nadaw", "\u1002\u102D\u1010\u102F\u1019\u103C\u1031\u1000\u1039\u1000\u101E\u1035\u102F");
		mon.put("Pyatho", "\u1002\u102D\u1010\u102F\u1015\u103E\u1031\u102C\u103A");
		mon.put("Tabodwe", "\u1002\u102D\u1010\u102F\u1019\u102C\u103A");
		mon.put("Tabaung", "\u1002\u102D\u1010\u102F\u1016\u101D\u103A\u101B\u1002\u102D\u102F\u1014\u103A");
		mon.put("waxing", "\u1019\u1036\u1000\u103A");
		mon.put("waning", "\u1005\u103D\u1031\u1000\u103A");
		mon.put("full moon", "\u1015\u1031\u105A\u103A");
		mon.put("new moon", "\u1021\u102D\u102F\u1010\u103A");
		mon.put("Myanmar Year", "\u101E\u1000\u1039\u1000\u101B\u102C\u1007\u103A\u100D\u102F\u105A\u103A");
		mon.put("Ku", "\u101E\u105E\u102C\u1036");
		mon.put("Late", "");
		mon.put("Second", "\u1012\u102F");
		mon.put("Sunday", "\u1010\u1039\u105A\u1032\u1021\u1012\u102D\u102F\u1010\u103A");
		mon.put("Monday", "\u1010\u1039\u105A\u1032\u1005\u1014\u103A");
		mon.put("Tuesday", "\u1010\u1039\u105A\u1032\u1021\u1004\u1039\u105A\u102C");
		mon.put("Wednesday", "\u1010\u1039\u105A\u1032\u1017\u102F\u1012\u1039\u1013\u101D\u102B");
		mon.put("Thursday", "\u1010\u1039\u105A\u1032\u1017\u103C\u1034\u1017\u1010\u102D");
		mon.put("Friday", "\u1010\u1039\u105A\u1032\u101E\u102D\u102F\u1000\u103A");
		mon.put("Saturday", "\u1010\u1039\u105A\u1032\u101E\u1039\u105A\u102D\u101E\u101D\u103A");
		mon.put("Nay", "");
		mon.put("Yat", "");
		mon.put("Sabbath Eve", "\u1010\u1039\u105A\u1032\u1010\u102D\u105A\u103A");
		mon.put("Sabbath", "\u1010\u1039\u105A\u1032\u101E\u1033");
		mon.put("Yatyaza", "\u1010\u1039\u101B\u1032\u101B\u102C\u1007\u102C");
		mon.put("Afternoon Pyathada", "\u1010\u1039\u105A\u1032\u101B\u102C\u101F\u102F");
		mon.put("Pyathada", "\u1010\u1039\u105A\u1032\u1015\u103C\u102C\u1017\u1039\u1017\u1012\u102B");
		mon.put("New Year Day", "New Year's Day");
		mon.put("Independence Day", "\u1010\u1039\u105A\u1032\u101E\u1060\u1038\u1015\u103D\u1038");
		mon.put("Union Day", "\u1010\u1039\u105A\u1032\u1000\u105F\u102D\u1014\u103A\u100D\u102F\u105A\u103A");
		mon.put("Peasants Day", "\u1010\u1039\u105A\u1032\u101E\u105F\u102C\u1017\u1039\u105A");
		mon.put("Resistance Day", "\u1010\u1039\u105A\u1032\u1015\u1060\u1014\u103A\u1002\u1010\u1038\u1017\u105F\u102C");
		mon.put("Labour Day", "\u1010\u1039\u105A\u1032\u101E\u105F\u102C\u1000\u1019\u1060\u1031\u102C\u1014\u103A");
		mon.put("Martyrs Day", "\u1010\u1039\u105A\u1032\u1021\u102C\u1007\u102C\u1014\u1032");
		mon.put("Christmas Day", "\u1010\u1039\u105A\u1032\u1001\u101B\u1031\u103F\u1019\u102C\u1010\u103A");
		mon.put("Buddha Day", "\u1010\u1039\u105A\u1032\u101E\u1039\u1018\u105A\u103A\u1016\u100D\u102C\u103A\u1007\u103C\u1032");
		mon.put("Start of Buddhist Lent", "\u1010\u1039\u105A\u1032\u1010\u103D\u1036\u1013\u101D\u103A\u1013\u1019\u1039\u1019\u1005\u1000\u103A");
		mon.put("End of Buddhist Lent", "\u1010\u1039\u105A\u1032\u1021\u1018\u102D\u1013\u101B\u103A");
		mon.put("Tazaungdaing", "\u101E\u1039\u1018\u105A\u103A\u1015\u1030\u1007\u1034\u1015\u105F\u1010\u103A\u1015\u105E\u102C\u105A\u103A");
		mon.put("National Day", "\u1010\u1039\u105A\u1032\u1000\u1031\u102C\u1014\u103A\u1002\u1000\u1030\u1017\u105F\u102C");
		mon.put("Karen New Year Day", "\u1000\u101B\u1031\u105A\u103A\u101C\u103E\u102C\u1032\u101E\u105E\u102C\u1036");
		mon.put("Tabaung Pwe", "\u101E\u1039\u1018\u105A\u103A\u1016\u101D\u103A\u101B\u1002\u102D\u102F\u1014\u103A");
		mon.put("Thingyan Akyo", "\u1010\u1039\u105A\u1032\u1012\u1005\u1038\u1021\u1010\u1038");
		mon.put("Thingyan Akya", "\u1010\u1039\u105A\u1032\u1021\u1010\u1038\u1005\u103E\u1031\u103A");
		mon.put("Thingyan Akyat", "\u1010\u1039\u105A\u1032\u1021\u1010\u1038\u1000\u103C\u102C\u1015\u103A");
		mon.put("Thingyan Atat", "\u1010\u1039\u105A\u1032\u1021\u1010\u1038\u1010\u102D\u102F\u1014\u103A");
		mon.put("Myanmar New Year Day", "\u1010\u1039\u105A\u1032\u101E\u105E\u102C\u1036\u1010\u105F\u102D");
		mon.put("Amyeittasote", "\u1000\u102D\u102F\u1014\u103A\u1021\u1019\u103C\u102D\u102F\u1010\u103A");
		mon.put("Warameittugyi", "\u1000\u102D\u102F\u1014\u103A\u101D\u102B\u101B\u1019\u102D\u1010\u1039\u1010\u102F\u1007\u105E\u1031\u102C\u103A");
		mon.put("Warameittunge", "\u1000\u102D\u102F\u1014\u103A\u101D\u102B\u101B\u1019\u102D\u1010\u1039\u1010\u102F\u100D\u1031\u102C\u1010\u103A");
		mon.put("Thamaphyu", "\u1000\u102D\u102F\u1014\u103A\u101C\u1031\u105A\u103A\u1012\u102D\u102F\u1000\u103A");
		mon.put("Thamanyo", "\u1000\u102D\u102F\u1014\u103A\u101F\u102F\u1036\u1017\u103C\u1019\u103A");
		mon.put("Yatpote", "\u1000\u102D\u102F\u1014\u103A\u101C\u102E\u102F\u101C\u102C\u103A");
		mon.put("Yatyotema", "\u1000\u102D\u102F\u1014\u103A\u101A\u102F\u1010\u103A\u1019\u102C");
		mon.put("Mahayatkyan", "\u1000\u102D\u102F\u1014\u103A\u101F\u103D\u1036\u1001\u102D\u102F\u101F\u103A");
		mon.put("Nagapor", "\u1014\u102C\u103A\u1019\u1036\u1000\u103A");
		mon.put("Shanyat", "\u1010\u1039\u105A\u1032\u1012\u1010\u1014\u103A");
		mon.put(",", "\u104A");
		mon.put(".", "\u104B");
		mon.put("Mon National Day", "\u1010\u1039\u105A\u1032\u1000\u1031\u102C\u1014\u103A\u1002\u1000\u1030\u1019\u1014\u103A");
		mon.put("Mon Fallen Day", "\u1010\u1039\u105A\u1032\u101F\u1036\u101E\u102C\u101D\u1010\u1033\u101C\u102E\u102F");
		mon.put("Mon Revolution Day", "\u1010\u1039\u105A\u1032\u1015\u1060\u1014\u103A\u1002\u1010\u1038\u1019\u1014\u103A");
		mon.put("Mon Women Day", "\u1010\u1039\u105A\u1032\u100A\u1038\u1017\u103C\u1034\u1019\u1014\u103A");
		mon.put("G. Aung San BD", "\u1010\u1039\u105A\u1032\u101E\u105F\u102D\u105A\u103A\u1017\u105F\u102C \u1021\u1036\u105A\u103A\u101E\u102C\u1014\u103A\u1012\u103E\u103A\u1019\u105E\u102D\u101F\u103A");
		mon.put("Valentines Day", "\u1010\u1039\u105A\u1032\u101D\u102F\u1010\u103A\u1017\u1060\u102C\u1032");
		mon.put("Earth Day", "\u1010\u1039\u105A\u1032\u1002\u1060\u1038\u1000\u101D\u103A");
		mon.put("April Fools Day", "\u1010\u1039\u105A\u1032\u101E\u1039\u1015\u1015\u101B\u1021\u103A");
		mon.put("Red Cross Day", "\u1010\u1039\u105A\u1032\u1007\u102D\u102F\u105A\u103A\u1001\u1039\u100D\u102C\u103A\u100D\u102C\u1032");
		mon.put("United Nations Day", "\u1010\u1039\u105A\u1032\u1000\u102F\u101C\u101E\u1019\u1039\u1019\u1002\u1039\u1002");
		mon.put("Halloween", "\u1010\u1039\u105A\u1032\u101F\u1031\u101D\u103A\u101C\u101D\u103A\u101D\u102D\u1014\u103A");
		mon.put("Shan New Year Day", "\u1010\u1039\u105A\u1032\u101E\u1031\u1036\u101C\u103E\u102C\u1032\u101E\u105E\u102C\u1036");
		mon.put("Mothers Day", "\u1010\u1039\u105A\u1032\u1019\u102D\u1021\u1036\u1000\u103A");
		mon.put("Fathers Day", "\u1010\u1039\u105A\u1032\u1019\u1021\u1036\u1000\u103A");
		mon.put("Sasana Year", "\u101E\u1000\u1039\u1000\u101B\u102C\u1007\u103A \u101E\u102C\u101E\u1014\u102C");
		mon.put("Eid", "\u1021\u102D\u1012\u103A");
		mon.put("Diwali", "\u1012\u102E\u101D\u102B\u101C\u102E");
		mon.put("Mahathamaya Day", "\u1019\u101F\u102C\u101E\u1019\u101A\u1014\u1031\u1037");
		mon.put("Garudhamma Day", "\u1002\u101B\u102F\u1013\u1019\u1039\u1019\u1014\u1031\u1037");
		mon.put("Metta Day", "\u1019\u1031\u1010\u1039\u1010\u102C\u1014\u1031\u1037");
		mon.put("Taungpyone Pwe", "\u1010\u1031\u102C\u1004\u103A\u1015\u103C\u102F\u1014\u103A\u1038\u1015\u103D\u1032");
		mon.put("Yadanagu Pwe", "\u101B\u1010\u1014\u102C\u1037\u1002\u1030\u1015\u103D\u1032");
		mon.put("Authors Day", "\u1005\u102C\u1006\u102D\u102F\u1010\u1031\u102C\u103A\u1014\u1031\u1037");
		mon.put("World Teachers Day", "\u1000\u1019\u1039\u1018\u102C\u1037\u1006\u101B\u102C\u1019\u103B\u102C\u1038\u1014\u1031\u1037");
		mon.put("Holiday", "\u101B\u102F\u1036\u1038\u1015\u102D\u1010\u103A\u101B\u1000\u103A");
		mon.put("Chinese New Year", "\u1010\u101B\u102F\u1010\u103A\u1014\u103E\u1005\u103A\u101E\u1005\u103A\u1000\u1030\u1038");
		mon.put("Easter", "\u1011\u1019\u103C\u1031\u102C\u1000\u103A\u101B\u102C\u1014\u1031\u1037");
		mon.put("Good Friday", "\u101E\u1031\u102C\u1000\u103C\u102C\u1014\u1031\u1037\u1000\u103C\u102E\u1038");
		
		//TODO Need Translate to Mon
		mon.put("West", "\u1021\u1014\u1031\u102C\u1000\u103A");
		mon.put("North", "\u1019\u103C\u1031\u102C\u1000\u103A");
		mon.put("East", "\u1021\u101B\u103E\u1031\u1037");
		mon.put("South", "\u1010\u1031\u102C\u1004\u103A");
		mon.put("Binga", "\u1018\u1004\u103A\u1039\u1002");
		mon.put("Atun", "\u1021\u1011\u103D\u1014\u103A\u1038");
		mon.put("Yaza",  "\u101B\u102C\u1007");
		mon.put("Adipati", "\u1021\u1013\u102D\u1015\u1010\u102D");
		mon.put("Marana", "\u1019\u101B\u100F");
		mon.put("Thike", "\u101E\u102D\u102F\u1000\u103A");
		mon.put("Puti", "\u1015\u102F\u1010\u102D");
		mon.put("Orc", "\u1018\u102E\u101C\u1030\u1038");
		mon.put("Elf", "\u1014\u1010\u103A");
		mon.put("Human", "\u101C\u1030");
		
		// Zawgyi
		zawgyi.put("0", "\u1040");
		zawgyi.put("1", "\u1041");
		zawgyi.put("2", "\u1042");
		zawgyi.put("3", "\u1043");
		zawgyi.put("4", "\u1044");
		zawgyi.put("5", "\u1045");
		zawgyi.put("6", "\u1046");
		zawgyi.put("7", "\u1047");
		zawgyi.put("8", "\u1048");
		zawgyi.put("9", "\u1049");
		zawgyi.put("January", "\u1007\u1014\u1039\u1014\u101D\u102B\u101B\u102E");
		zawgyi.put("February", "\u1031\u1016\u1031\u1016\u102C\u1039\u101D\u102B\u101B\u102E");
		zawgyi.put("March", "\u1019\u1010\u1039");
		zawgyi.put("April", "\u1027\u107F\u1015\u102E");
		zawgyi.put("May", "\u1031\u1019");
		zawgyi.put("June", "\u1007\u103C\u1014\u1039");
		zawgyi.put("July", "\u1007\u1030\u101C\u102D\u102F\u1004\u1039");
		zawgyi.put("August", "\u1029\u1002\u102F\u1010\u1039");
		zawgyi.put("September", "\u1005\u1000\u1039\u1010\u1004\u1039\u1018\u102C");
		zawgyi.put("October", "\u1031\u1021\u102C\u1000\u1039\u1010\u102D\u102F\u1018\u102C");
		zawgyi.put("November", "\u1014\u102D\u102F\u101D\u1004\u1039\u1018\u102C");
		zawgyi.put("December", "\u1012\u102E\u1007\u1004\u1039\u1018\u102C");
		zawgyi.put("First Waso", "\u1015\u101D\u102B\u1006\u102D\u102F");
		zawgyi.put("Second Waso", "\u1012\u102F\u101D\u102B\u1006\u102D\u102F");
		zawgyi.put("Tagu", "\u1010\u1014\u1039\u1001\u1030\u1038");
		zawgyi.put("Late Tagu", "\u1031\u108F\u103D\u102C\u1004\u1039\u1038\u1010\u1014\u1039\u1001\u1030\u1038");
		zawgyi.put("Kason", "\u1000\u1006\u102F\u1014\u1039");
		zawgyi.put("Late Kason", "\u1031\u108F\u103D\u102C\u1004\u1039\u1038\u1000\u1006\u102F\u1014\u1039");
		zawgyi.put("Nayon", "\u1014\u101A\u102F\u1014\u1039");
		zawgyi.put("Waso", "\u101D\u102B\u1006\u102D\u102F");
		zawgyi.put("Wagaung", "\u101D\u102B\u1031\u1001\u102B\u1004\u1039");
		zawgyi.put("Tawthalin", "\u1031\u1010\u102C\u1039\u101E\u101C\u1004\u1039\u1038");
		zawgyi.put("Thadingyut", "\u101E\u102E\u1010\u1004\u1039\u1038\u1000\u103C\u103A\u1010\u1039");
		zawgyi.put("Tazaungmon", "\u1010\u1014\u1039\u1031\u1006\u102C\u1004\u1039\u1019\u102F\u1014\u1039\u1038");
		zawgyi.put("Nadaw", "\u1014\u1010\u1039\u1031\u1010\u102C\u1039");
		zawgyi.put("Pyatho", "\u103B\u1015\u102C\u101E\u102D\u102F");
		zawgyi.put("Tabodwe", "\u1010\u1015\u102D\u102F\u1094\u1010\u103C\u1032");
		zawgyi.put("Tabaung", "\u1010\u1031\u1015\u102B\u1004\u1039\u1038");
		zawgyi.put("waxing", "\u101C\u1006\u1014\u1039\u1038");
		zawgyi.put("waning", "\u101C\u1006\u102F\u1010\u1039");
		zawgyi.put("full moon", "\u101C\u103B\u1015\u100A\u1039\u1037");
		zawgyi.put("new moon", "\u101C\u1000\u103C\u101A\u1039");
		zawgyi.put("Myanmar Year", "\u103B\u1019\u1014\u1039\u1019\u102C\u108F\u103D\u1005\u1039");
		zawgyi.put("Ku", "\u1001\u102F");
		zawgyi.put("Late", "\u1031\u108F\u103D\u102C\u1004\u1039\u1038");
		zawgyi.put("Second", "\u1012\u102F");
		zawgyi.put("Sunday", "\u1010\u1014\u1002\u1064\u1031\u108F\u103C");
		zawgyi.put("Monday", "\u1010\u1014\u101C\u1064\u102C");
		zawgyi.put("Tuesday", "\u1021\u1002\u1064\u102B");
		zawgyi.put("Wednesday", "\u1017\u102F\u1012\u1076\u101F\u1030\u1038");
		zawgyi.put("Thursday", "\u107E\u1000\u102C\u101E\u1015\u1031\u1010\u1038");
		zawgyi.put("Friday", "\u1031\u101E\u102C\u107E\u1000\u102C");
		zawgyi.put("Saturday", "\u1005\u1031\u1014");
		zawgyi.put("Nay", "\u1031\u1014\u1094");
		zawgyi.put("Yat", "\u101B\u1000\u1039");
		zawgyi.put("Sabbath Eve", "\u1021\u1016\u102D\u1010\u1039");
		zawgyi.put("Sabbath", "\u1025\u1015\u102F\u101E\u1039");
		zawgyi.put("Yatyaza", "\u101B\u1000\u1039\u101B\u102C\u1007\u102C");
		zawgyi.put("Afternoon Pyathada", "\u1019\u103C\u1014\u1039\u1038\u101C\u103C\u1032\u103B\u1015\u1086\u1012\u102B\u1038");
		zawgyi.put("Pyathada", "\u103B\u1015\u1086\u1012\u102B\u1038");
		zawgyi.put("New Year Day", "New Year's Day");
		zawgyi.put("Independence Day", "\u101C\u103C\u1010\u1039\u101C\u1015\u1039\u1031\u101B\u1038\u1031\u1014\u1094");
		zawgyi.put("Union Day", "\u103B\u1015\u100A\u1039\u1031\u1011\u102C\u1004\u1039\u1005\u102F\u1031\u1014\u1094");
		zawgyi.put("Peasants Day", "\u1031\u1010\u102C\u1004\u1039\u101E\u1030 \u101C\u101A\u1039\u101E\u1019\u102C\u1038\u1031\u1014\u1094");
		zawgyi.put("Resistance Day", "\u1031\u1010\u102C\u1039\u101C\u103D\u1014\u1039\u1031\u101B\u1038\u1031\u1014\u1094");
		zawgyi.put("Labour Day", "\u1021\u101C\u102F\u1015\u1039\u101E\u1019\u102C\u1038\u1031\u1014\u1094");
		zawgyi.put("Martyrs Day", "\u1021\u102C\u1007\u102C\u1014\u100A\u1039\u1031\u1014\u1094");
		zawgyi.put("Christmas Day", "\u1001\u101B\u1005\u1065\u1019\u1010\u1039\u1031\u1014\u1094");
		zawgyi.put("Buddha Day", "\u1031\u100A\u102C\u1004\u1039\u1031\u101B \u101E\u103C\u1014\u1039\u1038\u1015\u103C\u1032");
		zawgyi.put("Start of Buddhist Lent", "\u1013\u1019\u107C\u1005\u107E\u1000\u102C\u1031\u1014\u1094");
		zawgyi.put("End of Buddhist Lent", "\u1019\u102E\u1038\u1011\u103C\u1014\u1039\u1038\u1015\u103C\u1032");
		zawgyi.put("Tazaungdaing", "\u1010\u1014\u1039\u1031\u1006\u102C\u1004\u1039\u1010\u102D\u102F\u1004\u1039");
		zawgyi.put("National Day", "\u1021\u1019\u103A\u102D\u1033\u1038\u101E\u102C\u1038\u1031\u1014\u1094");
		zawgyi.put("Karen New Year Day", "\u1000\u101B\u1004\u1039 \u1014\u103D\u1005\u1039\u101E\u1005\u1039\u1000\u1030\u1038");
		zawgyi.put("Tabaung Pwe", "\u1010\u1031\u1015\u102B\u1004\u1039\u1038\u1015\u103C\u1032");
		zawgyi.put("Thingyan Akyo", "\u101E\u107E\u1000\u1064\u1014\u1039 \u1021\u1080\u1000\u102D\u1033");
		zawgyi.put("Thingyan Akya", "\u101E\u1080\u1000\u1064\u1014\u1039\u1039 \u1021\u1000\u103A");
		zawgyi.put("Thingyan Akyat", "\u101E\u1080\u1000\u1064\u1014\u1039\u1039 \u1021\u107E\u1000\u1010\u1039");
		zawgyi.put("Thingyan Atat", "\u101E\u1080\u1000\u1064\u1014\u1039\u1039 \u1021\u1010\u1000\u1039");
		zawgyi.put("Myanmar New Year Day", "\u1014\u103D\u1005\u1039\u1006\u1014\u1039\u1038 \u1010\u1005\u1039\u101B\u1000\u1039");
		zawgyi.put("Amyeittasote", "\u1021\u107F\u1019\u102D\u1010\u1071\u1005\u102F\u1010\u1039");
		zawgyi.put("Warameittugyi", "\u101D\u102B\u101B\u1019\u102D\u1010\u1071\u1033\u1080\u1000\u102E\u1038");
		zawgyi.put("Warameittunge", "\u101D\u102B\u101B\u1019\u102D\u1010\u1071\u1033\u1004\u101A\u1039");
		zawgyi.put("Thamaphyu", "\u101E\u1019\u102C\u1038\u103B\u1016\u1034");
		zawgyi.put("Thamanyo", "\u101E\u1019\u102C\u1038\u100A\u102D\u1033");
		zawgyi.put("Yatpote", "\u101B\u1000\u1039\u1015\u102F\u1015\u1039");
		zawgyi.put("Yatyotema", "\u101B\u1000\u1039\u101A\u102F\u1010\u1039\u1019\u102C");
		zawgyi.put("Mahayatkyan", "\u1019\u101F\u102C\u101B\u1000\u1039\u107E\u1000\u1019\u1039\u1038");
		zawgyi.put("Nagapor", "\u1014\u1002\u102B\u1038\u1031\u1015\u105A");
		zawgyi.put("Shanyat", "\u101B\u103D\u1019\u1039\u1038\u101B\u1000\u1039");
		zawgyi.put(",", "\u104A");
		zawgyi.put(".", "\u104B");
		zawgyi.put("Mon National Day", "\u1019\u103C\u1014\u1039\u1021\u1019\u103A\u102D\u1033\u1038\u101E\u102C\u1038\u1031\u1014\u1094");
		zawgyi.put("G. Aung San BD", "\u1017\u102D\u102F\u101C\u1039\u1001\u103A\u1033\u1015\u1039\u1031\u1019\u103C\u1038\u1031\u1014\u1094");
		zawgyi.put("Valentines Day", "\u1001\u103A\u1005\u1039\u101E\u1030\u1019\u103A\u102C\u1038\u1031\u1014\u1094");
		zawgyi.put("Earth Day", "\u1000\u1019\u107B\u102C\u1031\u103B\u1019\u1031\u1014\u1094");
		zawgyi.put("April Fools Day", "\u1027\u107F\u1015\u102E\u1021\u1090\u1030\u1038\u1031\u1014\u1094");
		zawgyi.put("Red Cross Day", "\u107E\u1000\u1000\u1039\u1031\u103B\u1001\u1014\u102E\u1031\u1014\u1094");
		zawgyi.put("United Nations Day", "\u1000\u102F\u101C\u101E\u1019\u107C\u1002\u1062\u1031\u1014\u1094");
		zawgyi.put("Halloween", "\u101E\u101B\u1032\u1031\u1014\u1094");
		zawgyi.put("Shan New Year Day", "\u101B\u103D\u1019\u1039\u1038\u1014\u103D\u1005\u1039\u101E\u1005\u1039\u1000\u1030\u1038");
		zawgyi.put("Mothers Day", "\u1021\u1031\u1019\u1031\u1014\u1094");
		zawgyi.put("Fathers Day", "\u1021\u1031\u1016\u1031\u1014\u1094");
		zawgyi.put("Sasana Year", "\u101E\u102C\u101E\u1014\u102C\u108F\u103D\u1005\u1039");
		zawgyi.put("Eid", "\u1021\u102D\u1012\u1039");
		zawgyi.put("Diwali", "\u1012\u102E\u101D\u102B\u101C\u102E");
		zawgyi.put("Mahathamaya Day", "\u1019\u101F\u102C\u101E\u1019\u101A\u1031\u1014\u1094");
		zawgyi.put("Garudhamma Day", "\u1002\u1090\u102F\u1013\u1019\u107C\u1031\u1014\u1094");
		zawgyi.put("Metta Day", "\u1031\u1019\u1010\u1071\u102C\u1031\u1014\u1094");
		zawgyi.put("Taungpyone Pwe", "\u1031\u1010\u102C\u1004\u1039\u103B\u1015\u1033\u1014\u1039\u1038\u1015\u103C\u1032");
		zawgyi.put("Yadanagu Pwe", "\u101B\u1010\u1014\u102C\u1037\u1002\u1030\u1015\u103C\u1032");
		zawgyi.put("Authors Day", "\u1005\u102C\u1006\u102D\u102F\u1031\u1010\u102C\u1039\u1031\u1014\u1094");
		zawgyi.put("World Teachers Day", "\u1000\u1019\u107B\u102C\u1037\u1006\u101B\u102C\u1019\u103A\u102C\u1038\u1031\u1014\u1094");
		zawgyi.put("Holiday", "\u1090\u102F\u1036\u1038\u1015\u102D\u1010\u1039\u101B\u1000\u1039");
		zawgyi.put("Chinese New Year", "\u1010\u1090\u102F\u1010\u1039\u108F\u103D\u1005\u1039\u101E\u1005\u1039\u1000\u1030\u1038");
		zawgyi.put("Easter", "\u1011\u1031\u103B\u1019\u102C\u1000\u1039\u101B\u102C\u1031\u1014\u1094");
		zawgyi.put("Good Friday", "\u1031\u101E\u102C\u107E\u1000\u102C\u1031\u1014\u1094\u1080\u1000\u102E\u1038");

		zawgyi.put("West", "\u1021\u1031\u1014\u102C\u1000\u1039");
		zawgyi.put("North", "\u1031\u103B\u1019\u102C\u1000\u1039");
		zawgyi.put("East", "\u1021\u1031\u101B\u103D\u1095");
		zawgyi.put("South", "\u1031\u1010\u102C\u1004\u1039");
		zawgyi.put("Binga", "\u1018\u1002\u1064");
		zawgyi.put("Atun", "\u1021\u1011\u103C\u1014\u1039\u1038");
		zawgyi.put("Yaza", "\u101B\u102C\u1007");
		zawgyi.put("Adipati", "\u1021\u1013\u102D\u1015\u1010\u102D");
		zawgyi.put("Marana", "\u1019\u101B\u100F");
		zawgyi.put("Thike", "\u101E\u102D\u102F\u1000\u1039");
		zawgyi.put("Puti",  "\u1015\u102F\u1010\u102D");
		zawgyi.put("Orc", "\u1018\u102E\u101C\u1030\u1038");
		zawgyi.put("Elf", "\u1014\u1010\u1039");
		zawgyi.put("Human", "\u101C\u1030");
	}

	private Language language;

	public LanguageCatalog() {
		this.language = Config.get().getLanguage();
	}

	public LanguageCatalog(Language language) {		
		if (language == null) throw new NullPointerException(); 
		this.language = language;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
        if (language == null)
            throw new IllegalArgumentException("Language cannot be null");		
		this.language = language;
	}

	public String translate(String string) {
		return translate(this.language, string);
	}

	private String translate(Language language, String string) {
		switch (language) {
			case MYANMAR:
				return myanmar.get(string);
			case ENGLISH:
				return english.get(string);
			case MON:
				return mon.get(string);
			case ZAWGYI:
				return zawgyi.get(string);
			default:
				return myanmar.get(string);
		}
	}

}
