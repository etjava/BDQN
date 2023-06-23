public class TestEnum{
	public static void main(String[] args){
		// 根据字符串获取枚举
		StatusEnum enable = Enum.valueOf(StatusEnum.class, "ENABLE");
		System.out.println(enable);
		//枚举比较直接用==
		System.out.println(enable == StatusEnum.ENABLE);

		// values方法获取所有的枚举
		StatusEnum[] values = StatusEnum.values();
		for (StatusEnum statusEnum : values) {
			// 打印枚举的位置
			System.out.println(statusEnum.ordinal());
		}
	}
}

// 简单的定义
enum WeekEnum {
    MONDAY, TUESDAY
}

// 有属性的定义
enum StatusEnum {
    ENABLE("1", "启用"), DISABLE("0", "禁用");

    private String code;

    private String name;

    StatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }
}