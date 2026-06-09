package calMateDotApp;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 画像調整専用クラス
public class Adjustment {
	public static void imageAdjustment(JPanel leftPanel, String address) {
		ImageIcon icon;
		JLabel imageLabel;
		try {
			// 画像の縮尺
			int width = 600;
			int height = 700;
			BufferedImage resize = defaultAdjustment(address, width, height);
			icon = new ImageIcon(resize);

			imageLabel = new JLabel(icon);
			imageLabel.setHorizontalAlignment(JLabel.CENTER);
			leftPanel.add(imageLabel, BorderLayout.CENTER);
		}catch (IOException e) {
			System.err.println("画像の読み込みに失敗しました: " + address);
			e.printStackTrace();
			icon = new ImageIcon(); 
		}
	}


	public static void imageAdjustment(String[] address, ImageIcon[] icons) {
		// 画像の縮尺
		int width = 125;
		int height = 155;
		for (int i = 0; i < address.length; i++) {
			try {
				// 画像の読み込み
				BufferedImage origin = ImageIO.read(new File(address[i]));

				// 器の作成
				BufferedImage resize = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

				// グラフィックスを取得して高品質調整
				Graphics2D g2d = resize.createGraphics();
				g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
				g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				g2d.drawImage(origin, 0, 0, width, height, null);
				g2d.dispose();

				icons[i] = new ImageIcon(resize);

			} catch (IOException e) {
				System.err.println("画像の読み込みに失敗しました: " + address[i]);
				e.printStackTrace();
				icons[i] = new ImageIcon(); 
			}
		}
	}

	public static ImageIcon adjustment(String address) {
		// 画像の縮尺
		int width = 125;
		int height = 155;
		try {
			BufferedImage resize = defaultAdjustment(address, width, height);
			return new ImageIcon(resize);

		} catch (IOException e) {
			System.err.println("画像の読み込みに失敗しました: " + address);
			e.printStackTrace();
			return new ImageIcon(); 
		}
	}
	
	private static BufferedImage defaultAdjustment(String address, int width, int height)
			throws IOException {
		BufferedImage origin = ImageIO.read(new File(address));
		BufferedImage resize = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = resize.createGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawImage(origin, 0, 0, width, height, null);
		g2d.dispose();
		return resize;
	}
}