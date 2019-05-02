package model;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	 
	@Entity
	@Table(name = "jenkins")
	public class Jenkins {
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "Id")
	    private long id;
	 
	    @Column(name = "App_Id")
	    private String App_Id;
	 
	    @Column(name = "Module")
	    private String Module;
	    
	    @Column(name = "TC_ID")
	    private String TC_ID;
	 
	   	@Column(name = "Stats")
	    private String Stats;
	    
	    @Column(name="Env")
	    private String Env;
	    
	    @Column(name="Technology")
	    private String Technology;
	    
	    @Column(name="Executed_Date")
	    private String Executed_Date;
	    
	    @Column(name="Build_ID")
	    private String Build_ID;
	    
	    @Column(name="Build_Name")
	    private String Build_Name;
	    
	    @Column(name="Executed_Env")
	    private String Executed_Env;
	    
	    @Column(name="Testcase_Name")
	    private String Testcase_Name;
	    
	    @Column(name="File_Name")
	    private String File_Name;
	    
	    @Column(name="TC_Execution_Time")
	    private String TC_Execution_Time;
	   
	 
	    public Jenkins() {
	    }
	 
	    
		public Jenkins(long id, String app_Id, String module, String stats, String env, String technology,
				String executed_Date, String build_ID, String build_Name, String executed_Env, String testcase_Name,
				String file_Name, String tC_Execution_Time) {
			super();
			this.id = id;
			App_Id = app_Id;
			Module = module;
			Stats = stats;
			Env = env;
			Technology = technology;
			Executed_Date = executed_Date;
			Build_ID = build_ID;
			Build_Name = build_Name;
			Executed_Env = executed_Env;
			Testcase_Name = testcase_Name;
			File_Name = file_Name;
			TC_Execution_Time = tC_Execution_Time;
		}


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getApp_Id() {
			return App_Id;
		}

		public void setApp_Id(String app_Id) {
			this.App_Id = app_Id;
		}

		public String getModule() {
			return Module;
		}

		public void setModule(String module) {
			this.Module = module;
		}

		 public String getTC_ID() {
				return TC_ID;
			}


			public void setTC_ID(String tC_ID) {
				TC_ID = tC_ID;
			}

		public String getStats() {
			return Stats;
		}

		public void setStats(String stats) {
			this.Stats = stats;
		}

		public String getEnv() {
			return Env;
		}

		public void setEnv(String env) {
			this.Env = env;
		}

		public String getTechnology() {
			return Technology;
		}

		public void setTechnology(String technology) {
			this.Technology = technology;
		}

		public String getExecuted_Date() {
			return Executed_Date;
		}

		public void setExecuted_Date(String executed_Date) {
			this.Executed_Date = executed_Date;
		}

		public String getBuild_ID() {
			return Build_ID;
		}

		public void setBuild_ID(String build_ID) {
			this.Build_ID = build_ID;
		}

		public String getBuild_Name() {
			return Build_Name;
		}

		public void setBuild_Name(String build_Name) {
			this.Build_Name = build_Name;
		}

		public String getExecuted_Env() {
			return Executed_Env;
		}

		public void setExecuted_Env(String executed_Env) {
			this.Executed_Env = executed_Env;
		}

		public String getTestcase_Name() {
			return Testcase_Name;
		}

		public void setTestcase_Name(String testcase_Name) {
			this.Testcase_Name = testcase_Name;
		}

		public String getFile_Name() {
			return File_Name;
		}

		public void setFile_Name(String file_Name) {
			this.File_Name = file_Name;
		}

		public String getTC_Execution_Time() {
			return TC_Execution_Time;
		}

		public void setTC_Execution_Time(String tC_Execution_Time) {
			this.TC_Execution_Time = tC_Execution_Time;
		}


		@Override
		public String toString() {
			return "Jenkins [ id = "+ id +", App_Id = " + App_Id +", Module = " + Module +", Stats = " + Stats+", Env = "+ Env +" , Technology = "+Technology+" , Executed_Date = "+Executed_Date+", Build_ID = "+Build_ID+", Build_Name = "+Build_Name+", Executed_Env = "+Executed_Env+", Testcase_Name = "+Testcase_Name+", File_Name = "+File_Name+", TC_Execution_Time = "+TC_Execution_Time+" ] ";
		}
		
		
	    

}
