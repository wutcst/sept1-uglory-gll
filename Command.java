package cn.edu.whut.sept.zuul;

/**
 * 用户输入命令调用的类，根据用户输入命令的不同，返回不同的函数结果，同时产生最后函数调用结果的不同
 */
public class Command
{
    private String commandWord;
    private String secondWord;

    /**
     * 构造函数，传递参数第一个、第二个命令
     * @param firstWord
     * @param secondWord
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**
     * 取第一个指令
     * @return
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * 取第二个指令，也就是方向
     * @return
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * 判断第一个指令是否为空，为空返回true，否则返回false
     * @return
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /**
     * 判断第二个指令是否不为空，不为空返回true，否则返回false
     * @return
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
