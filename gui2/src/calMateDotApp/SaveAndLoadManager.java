package calMateDotApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SaveAndLoadManager {
    private static final String SAVE_FILE = "お給仕管理.txt";

    // テキストファイルに現在の全ステータスとイメージパスを保存する
    public void save(List<Maid> maidList, List<Fairy> fairyList) {
    	String iconPath = "pic/maid/Rei.png";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SAVE_FILE))) {
            for (Maid m : maidList) {
                if (m.getIcon() != null) {
                    if (m.getIcon().getDescription() != null && !m.getIcon().getDescription().isEmpty()) {
                        iconPath = m.getIcon().getDescription();
                    } else {
                        iconPath = getOriginalPathByName(m.getName());
                    }
                }
                writer.write(String.format("%s,%s,%d,%d,%s\n", 
                    m.getRole(), m.getName(), m.getAttend(), m.getHeart(), iconPath));
            }
            for (Fairy f : fairyList) {
                if (f.getIcon() != null) {
                    if (f.getIcon().getDescription() != null && !f.getIcon().getDescription().isEmpty()) {
                        iconPath = f.getIcon().getDescription();
                    } else {
                        iconPath = getOriginalPathByName(f.getName());
                    }
                }
                writer.write(String.format("%s,%s,%d,%s,%s\n", 
                    f.getRole(), f.getName(), f.getAttend(), f.getStaffRole(), iconPath));
            }
            JOptionPane.showMessageDialog(null, "データを保存しました", "報告", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException _) {
        	JOptionPane.showMessageDialog(null, "データの保存に失敗しました！", "警告", JOptionPane.WARNING_MESSAGE);
        }
    }

    // アプリ起動時にイメージパスを紐付けて復元して呼び込みする
    public void load(List<Maid> maidList, List<Fairy> fairyList) {
        File file = new File(SAVE_FILE);
        if (!file.exists()) return; // 初回起動時用
        
        // 内部データをセーブデータに入れ替える為に初期化する
        maidList.clear();
        fairyList.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length < 4) continue;

                String role = tokens[0];
                String name = tokens[1];
                int attend = Integer.parseInt(tokens[2]);
                String address = (tokens.length > 4) ? tokens[4] : "";
                if (address.isEmpty()) {
                    address = getOriginalPathByName(name);
                }
                ImageIcon icon = Adjustment.adjustment(address);
                icon.setDescription(address);
                
                if ("メイド".equals(role)) {
                    int heart = Integer.parseInt(tokens[3]);
                    maidList.add(new Maid(name, role, attend, heart, icon));
                } else if ("妖精".equals(role)) {
                    String staffRole = tokens[3];
                    fairyList.add(new Fairy(name, role, attend, staffRole, icon));
                }
            }
        } catch (Exception _) {
        	JOptionPane.showMessageDialog(null, "データの読み込みに失敗しました！", "警告", JOptionPane.WARNING_MESSAGE);
        }
    }

	// 名前で初期画像パスを逆引きするメソッド
	private String getOriginalPathByName(String name) {
		return switch (name) {
			case "myao" -> "pic_01/maid/Myao.png";
			case "佐藤" -> "pic_01/fairy/佐藤.png";
			case "でるた" -> "pic_01/maid/Delta.png";
			case "まかろん" -> "pic_01/maid/Macaron.png";
			case "真昼" -> "pic_01/maid/Mahiru.png";
			case "みるく" -> "pic_01/maid/Milk.png";
			case "ねぎま" -> "pic_01/maid/Negima.png";
			case "高橋" -> "pic_01/fairy/高橋.png";
			case "鈴木" -> "pic_01/fairy/鈴木.png";
			case "れい" -> "pic_01/maid/Rei.png";
			default -> "pic/maid/Rei.png";
		};
	}
}
