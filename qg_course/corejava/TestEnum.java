public class TestEnum{
	public static void main(String[] args){
		// �����ַ�����ȡö��
		StatusEnum enable = Enum.valueOf(StatusEnum.class, "ENABLE");
		System.out.println(enable);
		//ö�ٱȽ�ֱ����==
		System.out.println(enable == StatusEnum.ENABLE);

		// values������ȡ���е�ö��
		StatusEnum[] values = StatusEnum.values();
		for (StatusEnum statusEnum : values) {
			// ��ӡö�ٵ�λ��
			System.out.println(statusEnum.ordinal());
		}
	}
}

// �򵥵Ķ���
enum WeekEnum {
    MONDAY, TUESDAY
}

// �����ԵĶ���
enum StatusEnum {
    ENABLE("1", "����"), DISABLE("0", "����");

    private String code;

    private String name;

    StatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}