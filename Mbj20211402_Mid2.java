import java.util.Scanner;

public class Mbj20211402_Mid2 {
	public static void main(String[] args) {
		
		int user=0;
		int userhp=100;
		int comhp=100;
		int win=0;
		int lose=0;
	    int pcom=3;
	    int puser=3;

		Scanner s=new Scanner(System.in);
		System.out.println("게임을 시작합니다.");
    	System.out.println("*RULE*");
    	System.out.println("서로의 HP는 100 으로 시작됩니다.");
    	System.out.println("게임에서 승리 시 10의 피해를 가합니다.");
    	System.out.println("연승할 경우, 횟수에 따라 추가로 10의 피해를 가합니다.");
    	System.out.println("이는 패배시에도 똑같이 적용됩니다.");
    	System.out.println("한쪽의 HP가 0이 되면 게임이 종료됩니다.");
    	System.out.println("이전 턴에 냈던 것은 다시 낼 수 없습니다. 이는 상대도 동일합니다.");
		System.out.println("게임을 도중에 그만둘려면 '3' 을 입력하세요.");
        while (true) {
    	System.out.println("=============================");
    	System.out.printf("사용자 HP : %d | 컴퓨터 HP : %d",userhp,comhp);
    	System.out.println("");
    	System.out.println("=============================");
		System.out.println("가위(0)/ 바위(1)/ 보(2) 중 하나를 입력하세요.");
		user=s.nextInt();
			if (user == 3) {
				System.out.println("게임을 종료합니다.");
				break;}
			if (user < 0) {
	            System.out.println("잘못된 숫자를 입력하였습니다. 0~2 의 수만 입력해주세요.");
	            continue;}
	        if (user > 2) {
	        	System.out.println("잘못된 숫자를 입력하였습니다. 0~2 의 수만 입력해주세요.");
	        	continue;}
	        if (user == puser) {
	            System.out.println("같은 수는 연속으로 입력할 수 없습니다. 다른 수를 입력하세요.");
	            continue;}
	        puser=user;


		int com;
		do {
		    com = (int)(Math.random() * 3);} 
		while (com == pcom);
		pcom = com;
		
		switch (com) {
		case 0:
			switch(user)
			{
			case 0:
				System.out.println("사용자 : 가위 | 컴퓨터 : 가위");
		    	System.out.println("");
				System.out.println("비겼습니다.");
		    	System.out.println("");
				break;
			case 1:
				System.out.println("사용자 : 바위 | 컴퓨터 : 가위");
		    	System.out.println("");
				System.out.println("이겼습니다.");
		    	System.out.println("");
				break;
			case 2:
				System.out.println("사용자 : 보 | 컴퓨터 : 가위");
		    	System.out.println("");
				System.out.println("졌습니다.");
		    	System.out.println("");
				break;
			}
			break;
        case 1:
        	switch(user)
			{
			case 0:
				System.out.println("사용자 : 가위 | 컴퓨터 : 바위");
		    	System.out.println("");
				System.out.println("졌습니다.");
		    	System.out.println("");
				break;
			case 1:
				System.out.println("사용자 : 바위 | 컴퓨터 : 바위");
		    	System.out.println("");
				System.out.println("비겼습니다.");
		    	System.out.println("");
				break;
			case 2:
				System.out.println("사용자 : 보 | 컴퓨터 : 바위");
		    	System.out.println("");
				System.out.println("이겼습니다.");
		    	System.out.println("");
				break;
			}
			break;	
        case 2:
        	switch(user)
			{
			case 0:
				System.out.println("사용자 : 가위 | 컴퓨터 : 보");
		    	System.out.println("");
				System.out.println("이겼습니다.");
		    	System.out.println("");
				break;
			case 1:
				System.out.println("사용자 : 바위 | 컴퓨터 : 보");
		    	System.out.println("");
				System.out.println("졌습니다.");
		    	System.out.println("");
				break;
			case 2:
				System.out.println("사용자 : 보 | 컴퓨터 : 보");
		    	System.out.println("");
				System.out.println("비겼습니다.");
		    	System.out.println("");
				break;
			}
			break;}	
			
		if (user==com) {
			lose=0;
			win=0;}
		else if((user==0&&com==2)||(user==1&&com==0)||(user==2&&com==1)){
			win++;
			lose=0;
			int damage=win*10;
			comhp-=damage;
			System.out.println("컴퓨터에게 "+damage+" 의 피해를 가합니다.");}
		else if((user==2&&com==0)||(user==0&&com==1)||(user==1&&com==2)){
			win=0;
			lose++;
			int comdamage=lose*10;
			userhp-=comdamage;
			System.out.println("사용자가 "+comdamage+" 의 피해를 입었습니다.");}
		else {
			continue;}
		
		if (userhp<=0) {
			System.out.println("당신의 체력이 0이 되었습니다.");
			System.out.println("패배하였습니다.");
			break;}
		if (comhp<=0) {
			System.out.println("컴퓨터의 체력이 0이 되었습니다.");
			System.out.println("승리하였습니다 !");
			break;}
		}
		}}
        
	

		