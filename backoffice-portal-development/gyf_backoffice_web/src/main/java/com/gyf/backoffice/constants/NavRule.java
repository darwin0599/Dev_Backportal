package com.gyf.backoffice.constants;

public enum NavRule {

	VIEW360("360_VIEW", Long.valueOf(1)),
	ACCOUNTS("ACCOUNTS", Long.valueOf(2)),
	PSE("PSE",Long.valueOf(3)),
	INIT("INIT", Long.valueOf(0)),
	CREDIT_CARD("CREDIT_CARD", Long.valueOf(4));
	
	private String rule;
	private Long id;
	
	private NavRule(String rule, Long id) {
		this.rule = rule;
		this.id = id;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public static NavRule getById(Long id) {
		for(NavRule rule : NavRule.values()) {
			if(rule.getId().compareTo(id) == 0) {
				return rule;
			}
		}
		return null;
	}
}
