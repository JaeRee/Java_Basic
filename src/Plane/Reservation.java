package Plane;
import java.util.*;


public class Reservation {
	
			
			Scanner sc ;
			boolean isRun;
			Airline airline;
			
				public Reservation() {
						sc = new Scanner(System.in);
						isRun = true;
						System.out.println("======= ����� ���� ���α׷�=======");
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
							System.out.println("�װ��縦 ���� �������ּ���: ");
						break;
						
					case 3:
						airline.checkSeat();
						break;
						
					case 4:
						programEnd();
						break;
						
					case 5:
						System.out.println(" �߸� �Է��ϼ̽��ϴ�.");
						break;
					
					}
				}

				
				public void programEnd() {
						System.out.println("���α׷��� �����մϴ�.");
						isRun=false;
				}
				
				public int info() {
					System.out.println("1. �װ��� ���� ");
					System.out.println("2. �¼� ����");
					System.out.println("3. �¼� Ȯ��");
					System.out.println("4. ����");
					System.out.println("�޴��� �������ּ��� : ");
					
					return sc.nextInt();
					
				}
				
				public void choiceAirline() {
					System.out.println("1. �����װ� \t 2. �ƽþƳ��װ� \t 3.�����װ�");
					System.out.print("�װ��縦 �������ּ���: ");
				
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
								System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
								break;
						
						}
				}		
				
				public void reserve() {
					airline.printWelcom();
					System.out.print("�¼��� ������ �ּ���.(1-30,A-F) : ");
					String str = sc.next();
					String[] strArr = str.split(",");
					
					airline.reserveSeat(Integer.parseInt(strArr[0])-1, strArr[1].charAt(0));
				}
				
			}
		

