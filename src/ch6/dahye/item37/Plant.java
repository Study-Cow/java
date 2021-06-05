package ch6.dahye.item37;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    @Override
    public String toString() {
        return name;
    }
}
