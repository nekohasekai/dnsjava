package org.xbill.DNS.lookup;

/**
 * Thrown to indicate that records of the name and type queried does not exist, corresponding to the
 * NXRRSET return code as specified in RFC2136 Section 2.2.
 */
public class NoSuchRRSetException extends LookupFailedException {
  public NoSuchRRSetException() {
    super();
  }
}
