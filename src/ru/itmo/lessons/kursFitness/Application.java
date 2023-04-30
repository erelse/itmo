package ru.itmo.lessons.kursFitness;

public class Application {
    public static void main(String[] args) {

        HolderOfSubscription holder01 = new HolderOfSubscription("Иван", "Бор", 1999);
        HolderOfSubscription holder02 = new HolderOfSubscription("Анна", "Керро", 1995);
        HolderOfSubscription holder03 = new HolderOfSubscription("Дмитрий", "Андреев", 1981);
        HolderOfSubscription holder04 = new HolderOfSubscription("Ольга", "Хамидуллина", 1979);
        HolderOfSubscription holder05 = new HolderOfSubscription("Руслан", "Хамидуллин", 1976);
        HolderOfSubscription holder06 = new HolderOfSubscription("Борис", "Брюшко", 1998);
        HolderOfSubscription holder07 = new HolderOfSubscription("Павел", "Логачев", 1987);
        HolderOfSubscription holder08 = new HolderOfSubscription("Анастасия", "Котсалайнен", 1993);
        HolderOfSubscription holder09 = new HolderOfSubscription("Алексей", "Савкин", 1990);
        HolderOfSubscription holder10 = new HolderOfSubscription("Мария", "Вайс", 1982);

        Subscription subscription01 = new Subscription(TypesOfSubscription.FORONEMONTHFULL, holder01);
        Subscription subscription02 = new Subscription(TypesOfSubscription.FORONEDAY, holder02);
        Subscription subscription03 = new Subscription(TypesOfSubscription.FORONEMONTHDAY, holder03);
        Subscription subscription04 = new Subscription(TypesOfSubscription.FORONEMONTHFULL, holder04);
        Subscription subscription05 = new Subscription(TypesOfSubscription.FORONEDAY, holder05);
        Subscription subscription06 = new Subscription(TypesOfSubscription.FORONEMONTHFULL, holder06);
        Subscription subscription07 = new Subscription(TypesOfSubscription.FORONEMONTHDAY, holder07);
        Subscription subscription08 = new Subscription(TypesOfSubscription.FORONEDAY, holder08);
        Subscription subscription09 = new Subscription(TypesOfSubscription.FORONEMONTHDAY, holder09);
        Subscription subscription10 = new Subscription(TypesOfSubscription.FORONEMONTHFULL, holder10);

        Fitness fitnessClub = new Fitness();

        fitnessClub.holderComesToFitness("тренажерный зал", subscription01);
        fitnessClub.holderComesToFitness("групповые занятия", subscription02);
        fitnessClub.holderComesToFitness("групповые занятия", subscription03);
        fitnessClub.holderComesToFitness("тренажерный зал", subscription04);
        fitnessClub.holderComesToFitness("бассейн", subscription05);
        fitnessClub.holderComesToFitness("групповые занятия", subscription06);
        fitnessClub.holderComesToFitness("тренажерный зал", subscription07);
        fitnessClub.holderComesToFitness("бассейн", subscription08);
        fitnessClub.holderComesToFitness("групповые занятия", subscription09);
        fitnessClub.holderComesToFitness("тренажерный зал", subscription10);

        fitnessClub.informationAboutEveryone();

        fitnessClub.fitnessIsClosing();

    }
}
