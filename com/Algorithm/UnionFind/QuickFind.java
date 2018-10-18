package UnionFind;

/**
 * ���ٲ���
 * 
 * @author wangshiz 
 * ͨ������ֵ��λ���ж��������Ƿ��������� ����֮ǰ�����Ķ���ֵ��Ҫ����һ�£�
 * ��ʵ�����㷨�Ǻܵ�Ч�ģ������������ʱ��
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

	// �ж��������Ƿ�����,���ز���ֵ
	public boolean connect(int p, int q) {
		return id[p] == id[q];
	}

	// ���±�q��ֵ�����±�p��ֵ�Լ�����������ֵ���Ա�֤p������ֵ��q������ֵ���
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
