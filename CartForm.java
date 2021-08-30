package jp.co.internous.leo.model.form;

import java.io.Serializable;

/**
 * カートフォーム
 * @author インターノウス
 *
 */
public class CartForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private int productId;
	private int productCount;
	private String idArg[];

	/**
	 * ユーザーIDを取得する
	 * @return ユーザーID
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * ユーザーIDを設定する
	 * @param userId ユーザーID
	 */
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * 商品IDを取得する
	 * @return 商品ID
	 */
	
	public int getProductId() {
		return productId;
	}
	
	/**
	 * 商品IDを設定する
	 * @param productId 商品ID
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	/**
	 * 個数を取得する
	 * @return 個数
	 */
	public int getProductCount() {
		return productCount;
	}
	
	/**
	 * 個数を設定する
	 * @param productCount 個数
	 */
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	/**
	 * チェックボックスで選択された商品のIDの配列を取得する
	 * @return 選択された商品のIDの配列
	 */
	public String[] getIdArg() {
		return idArg;
	}
	
	/**
	 * チェックボックスで選択された商品のIDの配列を設定する
	 * @param idArg 選択された商品のIDの配列
	 */
	public void setIdArg(String[] idArg) {
		this.idArg = idArg;
	}
}