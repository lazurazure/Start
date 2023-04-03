package HomeWork.L13HW;

public class AbonementInheritanceDemo {
    public static void main(String[] args) {
        AbonementPremiumPackage pPack = new AbonementPremiumPackage();
        AbonementBusinessPackage bPack = new AbonementBusinessPackage();
        AbonementEconomPackage ePack = new AbonementEconomPackage();

        pPack.showPackageVariables();
        pPack.showTotalPrice();

        bPack.showPackageVariables();
        bPack.showTotalPrice();

        ePack.showPackageVariables();
        ePack.showTotalPrice();
    }
}
