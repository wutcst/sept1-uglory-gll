package cn.edu.whut.sept.zuul;

import java.util.Scanner;

/**
 * 这是游戏的解析器，对用户输入的命令进行解析执行
 */
public class Parser
{
    private CommandWords commands;
    private Scanner reader;

    /**
     * 构造函数，新建命令单词对象和输入扫描器对象
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    /**
     * 根据输入取出两条指令
     * @return
     */
    public Command getCommand()
    {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();   
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();
            }
        }

        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    /**
     * 展示命令
     */
    public void showCommands()
    {
        commands.showAll();
    }
}
