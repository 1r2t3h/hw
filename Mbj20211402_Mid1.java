import java.util.Scanner;

public class Mbj20211402_Mid1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String user, com;
        String[] rsp = {"가위", "바위", "보"};

        System.out.println("게임을 시작합니다.");
        System.out.println("게임을 종료할려면 q 를 입력하세요.");
        while (true) {
        	System.out.println("==================");
        	System.out.println("가위/바위/보 중 하나를 입력하세요.");
        	user=s.next();
        		if (user.equalsIgnoreCase("q")){
        			System.out.println("게임을 종료합니다.");
        			break;
        }

        int rnd=(int) (Math.random() * rsp.length);
        com=rsp[rnd];
        
        if (user.equals("가위")) {
        	System.out.println("사용자: 가위 | 컴퓨터: " + com);
            if (com.equals("가위"))
                System.out.println("비겼습니다.");
            else if (com.equals("바위"))
                System.out.println("졌습니다.");
            else if (com.equals("보"))
                System.out.println("이겼습니다.");
        }


        else if (user.equals("바위")) {
        	System.out.println("사용자: 바위 | 컴퓨터: " + com);
            if (com.equals("가위"))
                System.out.println("이겼습니다.");
            else if (com.equals("바위"))
                System.out.println("비겼습니다.");
            else if (com.equals("보"))
                System.out.println("졌습니다.");
        }
                
        else if (user.equals("보")) {
        	System.out.println("사용자: 바위 | 컴퓨터: " + com);
            if (com.equals("가위"))
                System.out.println("졌습니다.");
            else if (com.equals("바위"))
                System.out.println("이겼습니다.");
            else if (com.equals("보"))
                System.out.println("비겼습니다.");
        }
        
        else{
            System.out.println("잘못된 입력입니다.");
            continue;
        }}
        
    s.close();
    }
}

