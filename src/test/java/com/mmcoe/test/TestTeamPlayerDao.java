package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import com.mmcoe.dao.TeamPlayerDao;

import com.mmcoe.entity.Player;

import com.mmcoe.entity.Team;

public class TestTeamPlayerDao {

	private static TeamPlayerDao dao;

	@BeforeAll

	public static void init() {

		dao = new TeamPlayerDao();

	}

	@Test

	public void testSavePlayer() {

		Player p = new Player(7, "MSD", "Keeper", 700000);

		assertNotNull(dao.savePlayer(p, "1"));

	}

	@Test

	public void testSaveTeam() {

		Team t = new Team("1", "CSK", "N Srinivasan");

		assertNotNull(dao.saveTeam(t));

	}

}