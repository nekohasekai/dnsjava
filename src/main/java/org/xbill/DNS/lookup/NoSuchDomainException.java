package org.xbill.DNS.lookup;

/**
 * Thrown to indicate that no data is associated with the given name, as indicated by the NXDOMAIN
 * response code as specified in RF2136 Section 2.2.
 */
public class NoSuchDomainException extends LookupFailedException {
  public NoSuchDomainException() {
    super();
  }
}
