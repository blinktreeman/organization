package ru.bcomms.organization.entity;

import common.DataInvalidityCode;
import common.DataInvalidityCourtDecision;

public class ManagerInvalidity {
    // код причины недостоверности
    protected DataInvalidityCode code;
    // решение суда (только для code = COURT)
    protected DataInvalidityCourtDecision decision;
}
