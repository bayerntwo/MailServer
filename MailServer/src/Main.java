import java.util.*;

public class Main {

    public static void main(String[] args) {
        SMTPSender sender = new SMTPSender();
        String id = "아이디", password = "비밀번호";
        String fromEmail = "전송자";
        String toEmail = "수신자";

        // 필요 정보들을 입력받음
        Scanner scan = new Scanner(System.in);
        System.out.print("From :");
        fromEmail = scan.nextLine();
        System.out.print("To :");
        toEmail = scan.nextLine();
        System.out.print("아이디 :" );
        id = scan.nextLine();
        System.out.print("비밀번호 : ");
        password = scan.nextLine();

        // [fromEmail]에서 [toEmail]로 이메일 전송
        if(sender.sendMail(id, password, fromEmail, toEmail, "네이버 메일에서 다음 메일로 전송\n"))
            System.out.println("메일 전송 성공!");
        else
            System.out.println("메일 전송 실패!");
    }
}
