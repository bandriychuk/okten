package lesson06_StreamAPI.homeWork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Computer> laptops = new ArrayList<>();
        laptops.add(new Computer("Apple MacBookPro 16", 2013, new HardDrive("Kingston", HardType.SSD, MadeIn.USA, 512), 5000, new Processor(ProcessorType.i7, 9, 2.7, MadeIn.KOREA)));
        laptops.add(new Computer("Apple MacBookPro 16", 2013, new HardDrive("Kingston", HardType.SSD, MadeIn.USA, 511), 4000, new Processor(ProcessorType.i7, 9, 2.7, MadeIn.KOREA)));
        laptops.add(new Computer("Apple MacBookPro 13", 2012, new HardDrive("Kingston", HardType.HDD, MadeIn.USA, 256), 1000, new Processor(ProcessorType.i5, 5, 1.7, MadeIn.INDIA)));
        laptops.add(new Computer("Apple MacBookPro 13", 2011, new HardDrive("Kingston", HardType.SSD, MadeIn.CHINA, 256), 1000, new Processor(ProcessorType.i5, 5, 1.7, MadeIn.USA)));
        laptops.add(new Computer("Apple MacBookPro 13", 2010, new HardDrive("Kingston", HardType.HDD, MadeIn.CHINA, 256), 1000, new Processor(ProcessorType.i5, 5, 1.7, MadeIn.CHINA)));
        laptops.add(new Computer("Apple MacBookPro 13", 2009, new HardDrive("Kingston", HardType.HDD, MadeIn.CHINA, 256), 1000, new Processor(ProcessorType.i5, 5, 1.7, MadeIn.KOREA)));

        // 1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        System.out.println("\n1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010");
        List<Computer> computers = laptops.stream()
                .filter(computer -> computer.getYear() > 2010)
                .collect(Collectors.toList());
        computers.forEach(System.out::println);
        System.out.println("< -------------------------------- >");

        // 2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник SSD Китай
        System.out.println("\n2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник SSD Китай: ");
        List<Computer> ssdChina = laptops.stream()
                .filter(computer -> computer.getYear() > 2010 && computer.getHardDrive().getType().equals(HardType.SSD) && computer.getHardDrive().getMadeIn().equals(MadeIn.CHINA))
                .collect(Collectors.toList());
        ssdChina.forEach(System.out::println);
        System.out.println("< -------------------------------- >");

        //3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник дисків не Китай
        System.out.println("\n3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник дисків не Китай");
        List<Computer> ssdNotChina = laptops.stream()
                .filter(computer -> computer.getYear() > 2010 && !computer.getHardDrive().getMadeIn().equals(MadeIn.CHINA))
                .collect(Collectors.toList());
        ssdNotChina.forEach(System.out::println);
        System.out.println("< -------------------------------- >");

        //4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
        System.out.println("\n4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб");
        List<Computer> hardDrive = laptops.stream()
                .filter(computer -> computer.getHardDrive().getMemory() > 500)
                .collect(Collectors.toList());
        hardDrive.forEach(System.out::println);
        System.out.println("< -------------------------------- >");


        //5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
        System.out.println("\n//5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7");
//        List<Computer> ssdMoreThen500i7 = laptops.stream()
//                .filter(computer -> computer.getHardDrive().getMemory() > 500 && computer.getProcessor().getProcessorType().equals(ProcessorType.i7))
//                .collect(Collectors.toList());
//        ssdMoreThen500i7.forEach(System.out::println);

        List<Computer> ssdMoreThen500i7 = laptops.stream()
                .filter(computer -> computer.getHardDrive().getMemory() > 500)
                .filter(computer -> computer.getProcessor().getProcessorType().equals(ProcessorType.i7))
                .collect(Collectors.toList());
        ssdMoreThen500i7.forEach(System.out::println);
        System.out.println("< -------------------------------- >");

        //6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною
        System.out.println("\n//6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7");
        List<Computer> sortByPrice = laptops
                .stream()
                .filter(computer -> computer.getHardDrive().getMemory() > 500)
//                .sorted((o1, o2) -> o1.getPrice() - o2.getPrice()) // - чогось видає помилку
                .sorted((Comparator.comparingDouble(Computer::getPrice)))
                .collect(Collectors.toList());
        sortByPrice.forEach(System.out::println);
        System.out.println("< -------------------------------- >");

    }

}
