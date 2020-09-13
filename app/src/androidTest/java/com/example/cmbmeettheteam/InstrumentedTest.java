package com.example.cmbmeettheteam;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.cmbmeettheteam.Data.JsonUtils;
import com.example.cmbmeettheteam.Models.TeamMember;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class InstrumentedTest {
    private String testJson =
            "[\n" +
                    "  {\n" +
                    "    \"id\": \"0\",\n" +
                    "    \"name\": \"Ben Easton\",\n" +
                    "    \"position\": \"Backend Engineer\",\n" +
                    "    \"profile_image\": \"https://d1ghufavkue0e7.cloudfront.net/cache/d4/67/d4670ffa4ed318affdca8c8452db892d.jpg\",\n" +
                    "    \"personality\": \"with a strong British \uD83C\uDDEC\uD83C\uDDE7 accent! I still use a lot of British phrases, like 'would you like a cup of tea?' and 'just popping to the loo!'\",\n" +
                    "    \"interests\": \"Hiking in nature, meditating, Krav Maga, avocados \uD83E\uDD51, helping people overcome chronic illnesses ⛑, performing standup comedy and making people laugh\",\n" +
                    "    \"dating_preferences\": \"is up for doing different and unique things, likes to laugh \uD83D\uDE02\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"1\",\n" +
                    "    \"name\": \"Aldrin Balisi\",\n" +
                    "    \"position\": \"iOS Engineer\",\n" +
                    "    \"profile_image\": \"https://d1ghufavkue0e7.cloudfront.net/cache/c6/46/c6461970732d1b9c1ccbcafc66fa7340.jpg\",\n" +
                    "    \"personality\": \"featured on the CMB Instagram page, Canadian \uD83C\uDDE8\uD83C\uDDE6, and a Raptors fan!\",\n" +
                    "    \"interests\": \"playing volleyball, sneakers, photography, weightlifting, basketball\",\n" +
                    "    \"dating_preferences\": \"likes to play volleyball, likes to try new things, enjoys cooking and eating\"\n" +
                    "  }\n" +
                    "]";

    @Test
    public void jsonToTeamList_isCorrect() {
        ArrayList<TeamMember> teamMembers = JsonUtils.jsonToTeamList(testJson);
        TeamMember teamMember = teamMembers.get(1);
        assertEquals("Aldrin Balisi", teamMember.getName());
        assertEquals("iOS Engineer", teamMember.getPosition());
    }
}
