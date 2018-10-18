package UnionFind;

/**
 * 快速查找
 * 
 * @author wangshiz 
 * 通过索引值定位来判断两个数是否“相连“， 并且之前相连的对象值需要保持一致，
 * 其实这种算法是很低效的，在数据量大的时候
 */
public class QuickFind {

	private int[] id;

	public QuickFind(int N) {
		// TODO Auto-generated constructor stub
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	// 判断两个数是否相连,返回布尔值
	public boolean connect(int p, int q) {
		return id[p] == id[q];
	}

	// 将下标q的值赋给下标p的值以及与他相连的值，以保证p的所有值和q的所有值相等
	public void union(int p, int q) {
		int idP = id[p];
		int idQ = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == idP) {
				id[i] = idQ;
			}
		}
	}
}
