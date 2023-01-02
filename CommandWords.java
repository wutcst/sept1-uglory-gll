package cn.edu.whut.sept.zuul;

/**
 * 合法的命令类，根据用户输入判断命令是否合法
 */
public class CommandWords
{
    /**
     * 合法输入的第一个指令的三个单词
     * go是去哪个方向
     * quit是退出
     * help是帮助指令
     */
    private static final String[] validCommands = {
            "go", "quit", "help","look","back"
    };

    /**
     * 构造函数
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * 判断用户输入命令是否合法
     * @param aString
     * @return
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    /**
     * 展示所有命令
     */
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
