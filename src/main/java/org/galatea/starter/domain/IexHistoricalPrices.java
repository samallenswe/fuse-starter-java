package org.galatea.starter.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IexHistoricalPrices {
  private BigDecimal close;
  private BigDecimal high;
  private BigDecimal low;
  private BigDecimal open;
  private Integer volume;
  private String symbol;
  private Date date;
}
