import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        System.out.println("Menu lựa chọn chức năng");
        System.out.println("1.Nhập danh sách sinh viên và điểm các môn");
        System.out.println("2.Tính điểm trung bình");
        System.out.println("3.Xếp loại học lực");
        System.out.println("4.Tìm kiếm theo tên sinh viên");
        System.out.println("5.Sắp xếp danh sách theo điểm trung bình");
        System.out.println("6 Thống kê");
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập vào chức năng cần sử dụng: ");
        int Choice = sc.nextInt();
        String [] lst1 = new String[sv];
        String [] lst2 = new String[mh];
        switch (Choice) {
            /* Tên sv */
            case 1:
                System.out.println("Chào mừng đến với nhập danh sách sinh viên và môn học");
                System.out.println("Nhập vào số lượng sinh viên: ");
                int sv = sc.nextInt();
                for (int i=0;i<lst1.length;i++)
                {
                    System.out.println(" Nhập tên của sinh viên "+ (i+1));
                    String DatTen = sc.next();
                    lst1[i]=DatTen;
                }
                /*Môn học */
                System.out.println("Nhập vào số lượng môn học: ");
                int mh = sc.nextInt();
                for (int x=0;x<lst2.length;x++)
                {
                    System.out.println(" Nhập tên của môn học "+ (x+1));
                    String DatMon = sc.next();
                    lst2[x]=DatMon;
                }
                double[][] diem = new double[sv][mh];
                for (int i = 0; i < sv; i++) {
                    System.out.println("Nhập điểm cho sinh viên: " + lst1[i]);

                for (int j = 0; j < mh; j++) 
                    {
                    System.out.println("Điểm môn " + lst2[j] + ": ");
                    diem[i][j] = sc.nextDouble();
                    }
                }
                    for (int i = 0; i < sv; i++) {
                    System.out.println("Sinh viên: " + lst1[i]);

                    for (int j = 0; j < mh; j++) {
                    System.out.println(lst2[j] + ": " + diem[i][j]);
                     }

                System.out.println();
                }
                break;
        
            default:
                System.out.println("Số nhập không hợp lệ");
                break;
        }
}
}
