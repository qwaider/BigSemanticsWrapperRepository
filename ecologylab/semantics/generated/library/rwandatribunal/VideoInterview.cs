//
// VideoInterview.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.rwandatribunal 
{
	/// <summary>
	/// video interview
	/// </summary>
	[SimplInherit]
	public class VideoInterview : Document
	{
		[SimplScalar]
		private MetadataString interviewee;

		[SimplScalar]
		private MetadataString role;

		[SimplScalar]
		private MetadataString countryOfOrigin;

		[SimplScalar]
		private MetadataString interviewDate;

		[SimplScalar]
		private MetadataString interviewers;

		[SimplScalar]
		private MetadataString partOrTimestamp;

		[SimplScalar]
		private MetadataParsedURL videoDownloadLink;

		[SimplScalar]
		private MetadataParsedURL audioDownloadLink;

		public VideoInterview()
		{ }

		public VideoInterview(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Interviewee
		{
			get{return interviewee;}
			set
			{
				if (this.interviewee != value)
				{
					this.interviewee = value;
					this.RaisePropertyChanged( () => this.Interviewee );
				}
			}
		}

		public MetadataString Role
		{
			get{return role;}
			set
			{
				if (this.role != value)
				{
					this.role = value;
					this.RaisePropertyChanged( () => this.Role );
				}
			}
		}

		public MetadataString CountryOfOrigin
		{
			get{return countryOfOrigin;}
			set
			{
				if (this.countryOfOrigin != value)
				{
					this.countryOfOrigin = value;
					this.RaisePropertyChanged( () => this.CountryOfOrigin );
				}
			}
		}

		public MetadataString InterviewDate
		{
			get{return interviewDate;}
			set
			{
				if (this.interviewDate != value)
				{
					this.interviewDate = value;
					this.RaisePropertyChanged( () => this.InterviewDate );
				}
			}
		}

		public MetadataString Interviewers
		{
			get{return interviewers;}
			set
			{
				if (this.interviewers != value)
				{
					this.interviewers = value;
					this.RaisePropertyChanged( () => this.Interviewers );
				}
			}
		}

		public MetadataString PartOrTimestamp
		{
			get{return partOrTimestamp;}
			set
			{
				if (this.partOrTimestamp != value)
				{
					this.partOrTimestamp = value;
					this.RaisePropertyChanged( () => this.PartOrTimestamp );
				}
			}
		}

		public MetadataParsedURL VideoDownloadLink
		{
			get{return videoDownloadLink;}
			set
			{
				if (this.videoDownloadLink != value)
				{
					this.videoDownloadLink = value;
					this.RaisePropertyChanged( () => this.VideoDownloadLink );
				}
			}
		}

		public MetadataParsedURL AudioDownloadLink
		{
			get{return audioDownloadLink;}
			set
			{
				if (this.audioDownloadLink != value)
				{
					this.audioDownloadLink = value;
					this.RaisePropertyChanged( () => this.AudioDownloadLink );
				}
			}
		}
	}
}