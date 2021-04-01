package com.spring.ex.command;

import java.sql.SQLException;

import org.springframework.ui.Model;

public interface PCommand {
	void execute(Model model) throws SQLException;
}
