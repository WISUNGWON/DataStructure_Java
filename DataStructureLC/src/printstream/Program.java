package printstream;

public class Program {

    public static void main(String[] args) {
        int kor1, kor2, kor3;
        int total;
        float avg;
        
        kor1 = 50;
        kor2 = 60;
        kor3 = 80;
        
        total = kor1 + kor2 + kor3;
        avg = total / 3;
        
        // -- ���� ��� �κ� 
        System.out.print("��������������������������������������\n");
        System.out.print("��    ���� ���                ��\n");
        System.out.print("��������������������������������������\n");
        
        System.out.printf("����1 : %d\n", kor1);
        System.out.printf("����2 : %d\n", kor2);
        System.out.printf("����3 : %d\n", kor3);
        System.out.printf("���� : 0");
        System.out.println("��� : 0.00");
        
        System.out.println(80);
        System.out.write(80);
        System.out.write('8');
        System.out.flush();

    }

}
