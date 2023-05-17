package strategy;

class Bruxo {
private Feitico feitiço;


void setFeitiço(Feitico feitiço) {
    this.feitiço = feitiço;
}

void lançarFeitiço() {
    feitiço.lançarFeitiço();
}
}