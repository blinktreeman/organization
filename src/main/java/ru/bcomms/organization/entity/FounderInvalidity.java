package ru.bcomms.organization.entity;

import common.DataInvalidityCode;
import common.DataInvalidityCourtDecision;

public class FounderInvalidity {
    // код причины недостоверности
    protected DataInvalidityCode dataInvalidityCode;
    // решение суда (только для code = COURT)
    protected DataInvalidityCourtDecision decision;
}
