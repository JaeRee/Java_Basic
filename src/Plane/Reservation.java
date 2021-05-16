package Plane;
import java.util.*;


public class Reservation {
	
			
			Scanner sc ;
			boolean isRun;
			Airline airline;
			
				public Reservation() {
						sc = new Scanner(System.in);
						isRun = true;
						System.out.println("======= 비행기 예약 프로그램=======");
				}
				
				
				public void programStart() {
					
					switch(info()) {
					
					case 1:
									choiceAirline();
									break;
									
					case 2: 
						if(airline != null)
							reserve();
						else
							System.out.println("항공사를 먼저 선택해주세요: ");
						break;
						
					case 3:
						airline.checkSeat();
						break;
						
					case 4:
						programEnd();
						break;
						
					case 5:
						System.out.println(" 잘못 입력하셨습니다.");
						break;
					
					}
				}

				
				public void programEnd() {
						System.out.println("프로그램을 종료합니다.");
						isRun=false;
				}
				
				public int info() {
					System.out.println("1. 항공사 선택 ");
					System.out.println("2. 좌석 예약");
					System.out.println("3. 좌석 확인");
					System.out.println("4. 종료");
					System.out.println("메뉴를 선택해주세요 : ");
					
					return sc.nextInt();
					
				}
				
				public void choiceAirline() {
					System.out.println("1. 대한항공 \t 2. 아시아나항공 \t 3.제주항공");
					System.out.print("항공사를 선택해주세요: ");
				
					switch(sc.nextInt()){
				
						case 1:
							airline = new KoreanAir();
							break;
							
						case 2:
							airline = new AsianaAir();
							break;
						
						case 3:
							airline = new JejuAir();
							break;
							
							default :
								System.out.println("잘못 입력하셨습니다. ");
								break;
						
						}
				}		
				
				public void reserve() {
					airline.printWelcom();
					System.out.print("좌석을 선택해 주세요.(1-30,A-F) : ");
					String str = sc.next();
					String[] strArr = str.split(",");
					
					airline.reserveSeat(Integer.parseInt(strArr[0])-1, strArr[1].charAt(0));
				}
				
			}
		

