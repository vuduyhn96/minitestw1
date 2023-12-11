import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLanThucHien = 0;
        int luaChon = -1;

        while (soLanThucHien < 3) {
            System.out.print("Tên đăng nhập: ");
            String tenNguoiDung = scanner.nextLine();
            System.out.print("Mật khẩu: ");
            String matKhau = scanner.nextLine();

            if (tenNguoiDung.equals("admin") && matKhau.equals("123456")) {
                while (luaChon != 0) {
                    hienThiMenu();
                    luaChon = scanner.nextInt();
                    xuLyLuaChon(scanner, luaChon);
                }
            } else {
                System.out.println("Tên người dùng hoặc mật khẩu không đúng");
                soLanThucHien++;
            }

            if (soLanThucHien == 3) {
                System.out.println("Đã nhập sai mật khẩu quá số lần cho phép.");
                break;
            }
        }
    }
    public static void hienThiMenu() {
        System.out.println("Menu");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ tam giác cân");
        System.out.println("0. Thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
    public static void xuLyLuaChon(Scanner scanner, int luaChon) {
        switch (luaChon) {
            case 1:
                veHinhChuNhat(scanner);
                break;
            case 2:
                veHinhVuong(scanner);
                break;
            case 3:
                veTamGiacCan(scanner);
                break;
            case 0:
                System.out.println("thoát chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 0 đến 3.");
        }
    }

    public static void veHinhChuNhat(Scanner scanner) {
        System.out.print("Nhập chiều dài: ");
        int chieuDai = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int chieuRong = scanner.nextInt();

        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void veHinhVuong(Scanner scanner) {
        System.out.print("Nhập cạnh hình vuông: ");
        int canh = scanner.nextInt();

        for (int i = 0; i < canh; i++) {
            for (int j = 0; j < canh; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void veTamGiacCan(Scanner scanner) {
        System.out.print("Nhập chiều cao của tam giác cân: ");
        int chieuCao = scanner.nextInt();

        for (int i = 0; i < chieuCao; i++) {
            for (int j = chieuCao - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





