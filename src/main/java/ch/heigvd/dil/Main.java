package ch.heigvd.dil;

import ch.heigvd.dil.commands.*;
import java.util.concurrent.Callable;
import picocli.CommandLine;

@CommandLine.Command(
    name = "sitegen",
    subcommands = {Init.class, Build.class, Clean.class, Version.class})
public class Main implements Callable<Integer> {

  public static void main(String[] args) {
    int rc = new CommandLine(new Main()).execute(args);
    System.exit(rc);
  }

  @Override
  public Integer call() {
    System.out.println("Subcommand needed: 'init', 'clean' or 'build'");
    return 0;
  }
}
