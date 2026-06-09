package Typing.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Score {
	List<Integer> s;

	String driver;

	String url;
	String user;
	String password;

	String input;
	String sort;

	int score = 0;
	int miss = 0;
	int correct = 0;
	double accuracy = 0;

	public int getScore() {
		return this.score;
	}

	public void scoreReset() {
		this.score = 0;
		this.miss = 0;
		this.correct = 0;
		this.accuracy = 0;
		this.s.clear();
	}

	//得点
	public void PlusScore() {
		this.score += 10;
		this.correct++;
	}

	//減点
	public void MinusScore() {
		this.score -= 5;
	}

	public int getMiss() {
		return this.miss;
	}

	public void setMiss() {
		this.miss++;
	}

	public double getAccuracy() {
		if(correct == 0 && miss == 0) {
			return 0;
		}else {
			this.accuracy = ((double) correct / (double) (correct + miss)) * 100;
			return this.accuracy;			
		}
	}

	public void setSQL() {
		driver = "org.postgresql.Driver";

		url = "jdbc:postgresql://localhost:5432/TypingGame";
		user = "postgres";
		password = "postgrestest";

		input = "INSERT INTO スコアランキング (スコア,ミス,正確性, ID) VALUES(?, ?, ?, ?)";

		try {
			// ドライバの明示的なロード (ビルドツール不使用時に推奨)
			Class.forName(driver);

			try (Connection conn = DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = conn.prepareStatement(input)) {

				pstmt.setInt(1, getScore());
				pstmt.setInt(2, getMiss());
				pstmt.setDouble(3, getAccuracy());
				pstmt.setInt(4, 1);

				int affectedRows = pstmt.executeUpdate();
				System.out.println(affectedRows + " 件のデータをPostgreSQLに保存しました。");
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBCドライバが見つかりません。ビルドパスを確認してください。");
			e.printStackTrace();
		} catch (SQLException e) {

			System.err.println("データベース処理中にエラーが発生しました。");
			e.printStackTrace();

		}

	}

	//sort & getter
	public List<Integer> sortSQL() {
		driver = "org.postgresql.Driver";

		url = "jdbc:postgresql://localhost:5432/TypingGame";
		user = "postgres";
		password = "postgrestest";

		sort = "SELECT * FROM スコアランキング ORDER BY スコア DESC";

		s = new ArrayList<Integer>();

		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sort);
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {

				int score = rs.getInt("スコア");
				s.add(score);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return s;
	}

	public int rankSQL() {

		driver = "org.postgresql.Driver";

		url = "jdbc:postgresql://localhost:5432/TypingGame";
		user = "postgres";
		password = "postgrestest";

		sort = "SELECT COUNT(*) AS rank_count FROM スコアランキング WHERE スコア > ?";
		int count = 1;
		try {
			Class.forName(driver);
			try (Connection conn = DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = conn.prepareStatement(sort)) {

				// 安全に現在のスコアをSQLにセット
				pstmt.setInt(1, this.score);

				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next()) {
						// データベースから取得した件数を整数として取得
						int higherUsers = rs.getInt("rank_count");
						// 自分より高いスコアの人数 + 1 が現在の順位
						count = higherUsers + 1;
					}
				}
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBCドライバが見つかりません。");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("順位取得中にデータベースエラーが発生しました。");
			e.printStackTrace();
		}

		return count;
	}

}