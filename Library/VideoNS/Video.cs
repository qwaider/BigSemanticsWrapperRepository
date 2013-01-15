//
// Video.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.Generated.Library.MiscNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.VideoNS 
{
	[SimplInherit]
	public class Video : CreativeWork
	{
		/// <summary>
		/// Date on which video is uploaded
		/// </summary>
		[SimplScalar]
		private MetadataDate uploadDate;

		/// <summary>
		/// video License
		/// </summary>
		[SimplScalar]
		private MetadataString license;

		[SimplScalar]
		private MetadataParsedURL pic;

		/// <summary>
		/// list of tags
		/// </summary>
		[SimplCollection("document")]
		[MmName("tag")]
		private List<Document> tag;

		/// <summary>
		/// Top 2 comments if any
		/// </summary>
		[SimplCollection("comment")]
		[MmName("top_comments")]
		private List<Comment> topComments;

		/// <summary>
		/// Total number of comments received
		/// </summary>
		[SimplScalar]
		private MetadataInteger numberOfComments;

		/// <summary>
		/// Total number of likes recived
		/// </summary>
		[SimplScalar]
		private MetadataInteger likes;

		/// <summary>
		/// Total number of dislikes received
		/// </summary>
		[SimplScalar]
		private MetadataInteger dislikes;

		/// <summary>
		/// Total number of views
		/// </summary>
		[SimplScalar]
		private MetadataInteger viewCount;

		public Video()
		{ }

		public Video(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataDate UploadDate
		{
			get{return uploadDate;}
			set
			{
				if (this.uploadDate != value)
				{
					this.uploadDate = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString License
		{
			get{return license;}
			set
			{
				if (this.license != value)
				{
					this.license = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataParsedURL Pic
		{
			get{return pic;}
			set
			{
				if (this.pic != value)
				{
					this.pic = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Document> Tag
		{
			get{return tag;}
			set
			{
				if (this.tag != value)
				{
					this.tag = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Comment> TopComments
		{
			get{return topComments;}
			set
			{
				if (this.topComments != value)
				{
					this.topComments = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger NumberOfComments
		{
			get{return numberOfComments;}
			set
			{
				if (this.numberOfComments != value)
				{
					this.numberOfComments = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Likes
		{
			get{return likes;}
			set
			{
				if (this.likes != value)
				{
					this.likes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger Dislikes
		{
			get{return dislikes;}
			set
			{
				if (this.dislikes != value)
				{
					this.dislikes = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataInteger ViewCount
		{
			get{return viewCount;}
			set
			{
				if (this.viewCount != value)
				{
					this.viewCount = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
